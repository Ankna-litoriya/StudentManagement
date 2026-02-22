package com.studentapp.dao;

import com.studentapp.model.Student;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    private String jdbcURL = "jdbc:mysql://localhost:3306/student_db?useSSL=false&serverTimezone=UTC";
    private String jdbcUsername = "root";      // <-- Replace with your MySQL username
    private String jdbcPassword = "Abcd@12345";   // <-- Replace with your MySQL password

    private static final String INSERT_SQL = "INSERT INTO students (name,email,course,age) VALUES (?,?,?,?)";
    private static final String SELECT_ALL_SQL = "SELECT * FROM students";
    private static final String DELETE_SQL = "DELETE FROM students WHERE id=?";
    private static final String UPDATE_SQL = "UPDATE students SET name=?,email=?,course=?,age=? WHERE id=?";

    protected Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void addStudent(Student s) throws SQLException {
        try(Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(INSERT_SQL)){
            ps.setString(1,s.getName());
            ps.setString(2,s.getEmail());
            ps.setString(3,s.getCourse());
            ps.setInt(4,s.getAge());
            ps.executeUpdate();
        }
    }

    public List<Student> getAllStudents() throws SQLException {
        List<Student> list = new ArrayList<>();
        try(Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(SELECT_ALL_SQL)){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                list.add(new Student(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("course"),
                    rs.getInt("age")
                ));
            }
        }
        return list;
    }

    public boolean deleteStudent(int id) throws SQLException {
        try(Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(DELETE_SQL)){
            ps.setInt(1,id);
            return ps.executeUpdate()>0;
        }
    }

    public boolean updateStudent(Student s) throws SQLException {
        try(Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(UPDATE_SQL)){
            ps.setString(1,s.getName());
            ps.setString(2,s.getEmail());
            ps.setString(3,s.getCourse());
            ps.setInt(4,s.getAge());
            ps.setInt(5,s.getId());
            return ps.executeUpdate()>0;
        }
    }
}