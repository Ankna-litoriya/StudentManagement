package com.studentapp.servlet;

import com.studentapp.dao.StudentDAO;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/delete-student")
public class DeleteStudentServlet extends HttpServlet {
    private StudentDAO dao = new StudentDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            dao.deleteStudent(id);
            response.sendRedirect("students");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}