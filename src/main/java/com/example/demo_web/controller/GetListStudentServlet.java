//package com.example.demo_web.controller;
//
//import com.example.demo_web.entity.Student;
//import com.example.demo_web.model.StudentModel;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//
//public class GetListStudentServlet extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        StudentModel studentModel = new StudentModel();
//        List<Student> studentList = studentModel.findAll();
//        req.setAttribute("studentList", studentList);
//        req.getRequestDispatcher("/admin/students/index.jsp").forward(req, resp);
//    }
//}
