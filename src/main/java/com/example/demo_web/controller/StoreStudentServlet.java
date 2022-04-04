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
//
//public class StoreStudentServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.getRequestDispatcher("/admin/students/store.jsp").forward(req, resp);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        int id = Integer.parseInt(req.getParameter("id"));
//        String name = req.getParameter("name");
//        String email = req.getParameter("email");
//        String address = req.getParameter("address");
//        Student student = new Student(id, name, email, address);
//        StudentModel studentModel = new StudentModel();
//        studentModel.save(student);
//        resp.sendRedirect("/students/list");
//    }
//}
