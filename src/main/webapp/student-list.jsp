<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Student List</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f7f9fc;
            margin: 0;
            padding: 0;
        }
        header {
            background-color: #4CAF50;
            color: white;
            padding: 15px;
            text-align: center;
        }
        table {
            width: 80%;
            margin: 30px auto;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 12px;
            text-align: center;
        }
        th {
            background-color: #4CAF50;
            color: white;
        }
        tr:nth-child(even) {background-color: #f2f2f2;}
        a.button {
            padding: 6px 12px;
            color: white;
            text-decoration: none;
            border-radius: 4px;
        }
        a.button:hover {
            opacity: 0.8;
        }
        .add-button {
            margin: 20px auto;
            display: block;
            width: 150px;
            text-align: center;
            background-color: #4CAF50;
        }
        .edit-button { background-color:#FF9800; }
        .delete-button { background-color:#f44336; }
    </style>
</head>
<body>
<header><h1>Student Management System</h1></header>

<a class="button add-button" href="add-student.jsp">Add New Student</a>

<table>
    <tr>
        <th>ID</th><th>Name</th><th>Email</th><th>Course</th><th>Age</th><th>Actions</th>
    </tr>
<%
    java.util.List<com.studentapp.model.Student> students = 
        (java.util.List<com.studentapp.model.Student>)request.getAttribute("studentList");
    if(students!=null){
        for(com.studentapp.model.Student s : students){
%>
    <tr>
        <td><%=s.getId()%></td>
        <td><%=s.getName()%></td>
        <td><%=s.getEmail()%></td>
        <td><%=s.getCourse()%></td>
        <td><%=s.getAge()%></td>
        <td>
            <a class="button edit-button" href="edit-student.jsp?id=<%=s.getId()%>">Edit</a>
            <a class="button delete-button" href="delete-student?id=<%=s.getId()%>">Delete</a>
        </td>
    </tr>
<%
        }
    } else {
%>
<tr><td colspan="6">No students found.</td></tr>
<%
    }
%>
</table>
</body>
</html>