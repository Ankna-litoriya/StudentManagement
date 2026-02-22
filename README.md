# Student Management System

A **Full-Stack Java Web Application** for managing student records.  
Built using **Java (JDK 17)**, **JSP/Servlets**, **MySQL 8.0**, **Maven**, and **Apache Tomcat 10**.  

This project demonstrates **CRUD operations** (Create, Read, Update, Delete) with a **clean and responsive beginner-friendly UI**, perfect for showcasing **core Java web development skills** in interviews.

---

## ✅ Features

- **Add, Edit, Delete, View Students**  
- **Clean & Responsive UI** using only **HTML & CSS** (no Bootstrap or complex frameworks)  
- **Maven Project**: Proper dependency management & build configuration  
- **Servlets & JSPs**: MVC architecture for clear separation of concerns  
- **MySQL Database** integration using JDBC  
- **Logger** integration with SLF4J for debugging  
- Beginner-friendly but **professional coding standards**

---

## 🎨 UI Overview

- **Student List Page:** Shows all students in a styled table with alternating row colors  
- **Add Student Page:** Simple form with input validation and clean layout  
- **Edit Student Page:** Pre-filled form for updating student details  
- **Action Buttons:**  
  - **Green** → Add/Update  
  - **Orange** → Edit  
  - **Red** → Delete  

---

## 💻 Technology Stack

| Layer        | Technology                                  |
| ------------ | ------------------------------------------ |
| Frontend     | HTML, CSS, JSP                              |
| Backend      | Java 17, Servlets, Maven                    |
| Database     | MySQL 8.0                                   |
| Server       | Apache Tomcat 10                             |
| Logging      | SLF4J (Simple Logger)                        |
| Build Tool   | Maven                                       |

---

## 🛠️ Installation & Setup

### Prerequisites

1. **Java JDK 17**  
2. **Apache Tomcat 10**  
3. **MySQL 8.0**  
4. **Eclipse IDE** with **Maven** support  

---

### Step 1: Clone the Repository

```bash
git clone https://github.com/your-username/StudentManagement.git
cd StudentManagement

Step 2: Setup Database

Open MySQL Workbench / Command Line

Create database:

CREATE DATABASE student_db;

Create table:

USE student_db;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    course VARCHAR(100),
    age INT NOT NULL
);
Step 3: Configure Database Connection

Update the database connection in StudentDAO.java:

private String jdbcURL = "jdbc:mysql://localhost:3306/student_db?useSSL=false&serverTimezone=UTC";
private String jdbcUsername = "root";      // your MySQL username
private String jdbcPassword = "root123";   // your MySQL password
Step 4: Build & Run Project

Open Eclipse → Import project → Existing Maven Project

Right-click project → Maven → Update Project

Run project → Run on Server → Apache Tomcat 10

Open browser:

http://localhost:8080/StudentManagement/
📌 Project Structure
StudentManagement/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/com/studentapp/
│   │   │   ├── dao/         # Database access classes
│   │   │   ├── model/       # Student model
│   │   │   └── servlet/     # Servlets for CRUD
│   │   └── webapp/
│   │       ├── WEB-INF/
│   │       │   └── web.xml
│   │       ├── index.jsp
│   │       ├── student-list.jsp
│   │       ├── add-student.jsp
│   │       └── edit-student.jsp
└── README.md
📈 Features You Can Discuss in Interviews

Maven Build Tool: Dependency management & modular project

MVC Architecture: JSP (View), Servlets (Controller), DAO (Model)

JDBC Connectivity: Clean connection handling, prepared statements

Exception Handling & Logging: SLF4J integration

Frontend Styling: Beginner-friendly yet professional CSS

CRUD Operations: End-to-end functionality

🧩 Future Improvements

Add search & filter functionality

Add pagination for large datasets

Add authentication & authorization

Add export to CSV/PDF functionality

🔗 Live Demo

If deployed on Tomcat, open:
http://localhost:8080/StudentManagement/

📚 References

JSP & Servlets Documentation

MySQL Connector/J Documentation

SLF4J Logger Documentation

📝 Author

Ankna Litoriya – passionate Java Full-Stack developer.

GitHub: https://github.com/Ankna-litoriya

LinkedIn: https://www.linkedin.com/in/ankna

This project demonstrates practical full-stack skills and is perfect to show in interviews, proving you can handle Java web apps, database integration, and front-end styling.
