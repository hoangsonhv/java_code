package com.example.demo_web.model;

import com.example.demo_web.annotation.Column;
import com.example.demo_web.annotation.Table;
import com.example.demo_web.util.ConnectionHelper;
import javafx.scene.control.Tab;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MyRepository<T> {

    public boolean save(T obj){
        String tableName = "";
        Class clazz = obj.getClass();
        if (!clazz.isAnnotationPresent(Table.class)){
            return false;
        }
        Table table = (Table) clazz.getDeclaredAnnotation(Table.class);
        if (table.name() != null && table.name().length() > 0){
            tableName = table.name();
        }else {
            tableName = clazz.getSimpleName() + "s";
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("INSERT INTO");
        stringBuilder.append(" ");
        stringBuilder.append(tableName);

        StringBuilder fieldNameBuilder = new StringBuilder();
        fieldNameBuilder.append("(");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field:
             fields) {
            if (!field.isAnnotationPresent(Column.class)){
                continue;
            }
            Column column = field.getDeclaredAnnotation(Column.class);
            fieldNameBuilder.append(column.name());
            fieldNameBuilder.append(", ");
        }

        fieldNameBuilder.setLength(fieldNameBuilder.length() - 2);
        fieldNameBuilder.append(")");
        stringBuilder.append(fieldNameBuilder);
        stringBuilder.append(" ");
        stringBuilder.append("VALUES");
        stringBuilder.append(" ");
        StringBuilder fieldValueBuilder = new StringBuilder();
        fieldValueBuilder.append("(");
        for (Field field:
             fields) {
            try {
                if (!field.isAnnotationPresent(Column.class)){
                    continue;
                }
                Column column = field.getDeclaredAnnotation(Column.class);
                field.setAccessible(true);
                if (column.type().contains("VARCHAR") || column.type().contains("TEXT")){
                    fieldValueBuilder.append("'");
                    fieldValueBuilder.append(field.get(obj));
                    fieldValueBuilder.append("'");
                }else {
                    fieldValueBuilder.append(field.get(obj));
                }
                fieldValueBuilder.append(", ");
            }catch (IllegalAccessException e){
                e.printStackTrace();
            }
        }
        fieldValueBuilder.setLength(fieldValueBuilder.length() - 2);
        fieldValueBuilder.append(")");
        stringBuilder.append(fieldValueBuilder);
//        System.out.println(stringBuilder.toString());
        try {
            Connection connection = ConnectionHelper.getConnection();
            Statement stt = connection.createStatement();
            stt.execute(stringBuilder.toString());
            System.out.println("Action success!");
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
        return  false;
    }
}
