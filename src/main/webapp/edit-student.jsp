<%@ page import="com.studentapp.model.Student" %>
<%
    Student student = (Student) request.getAttribute("student");
%>
<html>
<head>
    <title>Edit Student</title>
    <style>
        body { font-family: Arial; background-color: #f7f9fc; }
        .container {
            width: 400px; 
            margin: 50px auto;
            padding: 30px; 
            background-color: white; 
            border-radius: 8px; 
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        input[type=text], input[type=email], input[type=number] {
            width: 100%; padding: 10px; margin: 8px 0; border: 1px solid #ccc; border-radius: 4px;
        }
        input[type=submit] {
            background-color: #4CAF50; color: white; padding: 10px; border: none; border-radius: 4px; cursor: pointer;
        }
        input[type=submit]:hover { background-color: #45a049; }
        a { text-decoration: none; color: #2196F3; }
    </style>
</head>
<body>
<div class="container">
    <h2>Edit Student</h2>
    <form action="edit-student" method="post">
        <input type="hidden" name="id" value="<%=student.getId()%>">
        Name:<br><input type="text" name="name" value="<%=student.getName()%>" required><br>
        Email:<br><input type="email" name="email" value="<%=student.getEmail()%>" required><br>
        Course:<br><input type="text" name="course" value="<%=student.getCourse()%>"><br>
        Age:<br><input type="number" name="age" value="<%=student.getAge()%>" required><br><br>
        <input type="submit" value="Update Student">
    </form>
    <br><a href="students">Back to List</a>
</div>
</body>
</html>