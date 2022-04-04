//package com.example.demo_web.model;
//
//import com.example.demo_web.entity.Student;
//import com.example.demo_web.util.ConnectionHelper;
//
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//
//public class StudentModel {
//
//    public boolean save(Student student){
//        ConnectionHelper connectionHelper = new ConnectionHelper();
//        try {
//            Connection connection = connectionHelper.getConnection();
//            Statement statement = connection.createStatement();
//            String sqlStatement = "insert into students (id, name, email, address) values ("
//                    + student.getId() + ",'"
//                    + student.getName() + "','"
//                    + student.getEmail() + "','"
//                    + student.getAddress() + "')";
//            statement.execute(sqlStatement);
//            return true;
//        }catch (SQLException e) {
//            e.printStackTrace();
//        }catch (ClassNotFoundException e){
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
//
//    public List<Student> findAll(){
//        List<Student> listStudent = new ArrayList<>();
//        ConnectionHelper connectionHelper = new ConnectionHelper();
//        try {
//            Connection connection = connectionHelper.getConnection();
//            String sqlSelect = "select * from students";
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(sqlSelect);
//            while (resultSet.next()){
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                String email = resultSet.getString("email");
//                String address = resultSet.getString("address");
//                Student student = new Student(id,name,email,address);
//                listStudent.add(student);
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return listStudent;
//    }
//}
