#  Industry Readiness Scoring System

The **Industry Readiness Scoring System (IRSS)** is a full-stack web application designed to evaluate a student’s readiness for industry roles based on academic performance, certifications, technical skills, projects, and aptitude results.

The system calculates a readiness score and classifies students into:

-  Industry Ready  
-  Almost Ready  
-  Needs Improvement  

---

##  Project Overview

This project is built using **Spring Boot (Backend)** and **MySQL (Database)** with a responsive **HTML + Tailwind CSS frontend**.

It provides:

- Score calculation based on weighted criteria  
- Readiness level classification  
- REST API integration  
- Structured database storage  
- Clean and modern UI  

---

##  Tech Stack

### Frontend
- HTML5
- Tailwind CSS
- JavaScript (Fetch API)

### Backend
- Java 17
- Spring Boot
- Spring Data JPA
- Spring Security
- REST APIs

### Database
- MySQL

### Tools Used
- Eclipse IDE
- MySQL Workbench
- Git & GitHub
- Maven

---

##  System Architecture

```
Client (Browser)
        ↓
HTML + JavaScript (Frontend)
        ↓
Spring Boot REST Controller
        ↓
Service Layer (Scoring Logic)
        ↓
Repository Layer (JPA)
        ↓
MySQL Database
```

---

##  Database Design

The system follows a normalized multi-table structure:

### 1️⃣ Student
- id (Primary Key)
- name
- email
- department

### 2️⃣ StudentAcademic
- id (Primary Key)
- student_id (Foreign Key)
- cgpa
- certificates
- cs_levels

### 3️⃣ StudentProjects
- id (Primary Key)
- student_id (Foreign Key)
- mini_projects
- major_projects
- industry_projects

### 4️⃣ StudentAptitude
- id (Primary Key)
- student_id (Foreign Key)
- aptitude_completed
- high_aptitude_score

### 5️⃣ StudentReadiness
- id (Primary Key)
- student_id (Foreign Key)
- score
- readiness_level

---

## 🚀 How to Run the Project

### Step 1: Clone the Repository

```bash
git clone https://github.com/your-username/industry-readiness-scoring-system.git
cd industry-readiness-scoring-system
```

### Step 2: Create MySQL Database

```sql
CREATE DATABASE industry_readiness_system;
```

### Step 3: Configure application.properties

```
spring.datasource.url=jdbc:mysql://localhost:3306/industry_readiness_system
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
```

---

### Step 4: Run Backend

Using Eclipse:
Right Click → Run As → Spring Boot App

OR using Maven:

```bash
mvn spring-boot:run
```

Server runs at:

```
http://localhost:8080
```

---

### Step 5: Open Frontend

```
http://localhost:8080/index.html
```

---

## 📡 API Endpoint

### POST `/student/readiness`

### Sample Request Body

```json
{
  "certificates": 2,
  "csLevels": 3,
  "cgpa": 8.5,
  "miniProjects": 2,
  "majorProjects": 1,
  "industryProjects": 1,
  "aptitudeCompleted": true,
  "highAptitudeScore": true
}
```

### Sample Response

```json
{
  "score": 85,
  "readinessLevel": "Industry Ready"
}
```

---

## 📂 Project Structure

```
industry-readiness-system/
│
├── src/main/java/com/irss/industryreadiness/
│   ├── controller/
│   ├── service/
│   ├── model/
│   ├── repository/
│   ├── config/
│   └── security/
│
├── src/main/resources/
│   ├── static/
│   │   └── index.html
│   └── application.properties
│
├── pom.xml
└── README.md
```

---

## 🔀 Git Workflow

- main → Stable production code  
- feature/backend → Backend development  
- feature/frontend → Frontend development  

---

##  Future Enhancements

- Student authentication & login  
- Admin dashboard  
- Readiness analytics & reports  
- PDF export functionality  
- Role-based authorization  

---

##  Author

Swetha  
B.E. Computer Science Engineering  
Industry Readiness Scoring System Project  

