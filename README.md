# QA Demo Project

A clean **Spring Boot 3.4** demo showcasing REST API structure, error handling, and environment configuration best practices.  
Designed as a minimal, production-grade template for backend testing, automation demos, and QA validation workflows.

---

## 🚀 Overview

This project demonstrates:

- ✅ Controller-Service architecture  
- ✅ Structured API responses  
- ✅ Global error handling (no Whitelabel pages)  
- ✅ Maven build + Java 21 setup  
- ✅ REST endpoint testing base  

---

## 🧩 API Endpoints

| Method | Endpoint | Description | Example |
|--------|-----------|--------------|----------|
| `GET` | `/api/hello/{name}` | Returns personalized greeting | `/api/hello/Spide` |
| `GET` | `/api/hello` | Returns default QA status message | `/api/hello` |

### ✅ Response Example
```json
{
  "status": "QA Demo Active",
  "message": "Hello, Spide!"
}
```

❌ Error Example

```json
{
  "error": "Name must not be empty"
}
```
⚙️ Tech Stack
Component	Version	Purpose
Java	21	Main programming language
Spring Boot	3.4.11	Web application framework
Maven	3.9.11	Build and dependency management
Tomcat	Embedded	Application server
JSON	Native	Response formatting

🧱 Project Structure
qa-demo/
 ┣ src/
 ┃ ┣ main/java/com/amghar/qademo/
 ┃ ┃ ┣ controller/
 ┃ ┃ ┃ ┗ HelloController.java
 ┃ ┃ ┗ exception/
 ┃ ┃   ┗ GlobalExceptionHandler.java
 ┃ ┣ resources/
 ┃ ┃ ┗ application.properties
 ┣ pom.xml
 ┗ README.md

 
🧪 Run Locally
1️⃣ Clone the Repository
git clone https://github.com/SpideAmg/qa-demo.git
cd qa-demo

2️⃣ Run the Application
mvn spring-boot:run

3️⃣ Test the Endpoint
Open your browser or Postman and go to:
👉 http://localhost:8080/api/hello/Spide

🔍 QA / Automation Use Cases
API smoke testing baseline

Integration environment setup template

Base project for QA training, demos, or test framework integration

🧠 Notes
Handles 404 and 500 errors gracefully using GlobalExceptionHandler

Compatible with Postman, REST Assured, or Cypress API tests

Ready for integration into Jenkins or GitHub Actions pipeline

👨‍💻 Author
Spide Amghar
QA Engineer / Software Engineer in Test
📎 GitHub Profile
