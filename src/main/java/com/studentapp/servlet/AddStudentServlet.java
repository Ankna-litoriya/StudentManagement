package com.studentapp.servlet;

import com.studentapp.dao.StudentDAO;
import com.studentapp.model.Student;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/add-student")
public class AddStudentServlet extends HttpServlet {
    private StudentDAO dao = new StudentDAO();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String course = request.getParameter("course");
            int age = Integer.parseInt(request.getParameter("age"));

            Student s = new Student(0,name,email,course,age);
            dao.addStudent(s);
            response.sendRedirect("students");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}