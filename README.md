# 🧪 QA Demo – Spring Boot REST API

A professional Spring Boot QA testing demo project designed to simulate real-world backend QA scenarios.  
It includes REST endpoints, validation, structured error handling, and automated JUnit 5 + MockMvc tests.

## 🚀 Features

* ✅ RESTful API built with **Spring Boot 3.4.11**  
* ✅ Mock test automation endpoint for QA simulation  
* ✅ JUnit 5 + MockMvc automated tests  
* ✅ Global error handling  
* ✅ Ready-to-deploy Maven setup  
* ✅ Clean, layered structure  

## 🧩 Project Structure
qa-demo/
│
├── src/
│   ├── main/
│   │   └── java/com/amghar/qademo/
│   │       ├── QaDemoApplication.java
│   │       └── controller/
│   │           ├── HelloController.java
│   │           └── TestReportController.java
│   │
│   └── test/
│       └── java/com/amghar/qademo/controller/
│           ├── HelloControllerTest.java
│           └── TestReportControllerTest.java
│
├── pom.xml
└── README.md


## ⚙️ Setup & Run

### Prerequisites

* Java 21  
* Maven 3.9+  
* IntelliJ IDEA or VS Code  

### Run the Application

```bash
mvn spring-boot:run
```
Application runs on:
http://localhost:8080

🧠 API Endpoints
1️⃣ GET /api/hello/{name}
Returns a greeting message and QA status.
✅ Example Request
GET http://localhost:8080/api/hello/Spide

✅ Example Response
{
  "status": "QA Demo Active",
  "message": "Hello, Spide!"
}

❌ Error Example
GET http://localhost:8080/api/hello/

{
  "error": "Name must not be empty"
}

2️⃣ GET /api/test-report
Returns mock QA test results.
✅ Example Response
{
  "project": "QA Demo API",
  "executedAt": "2025-11-09T16:00:00",
  "summary": {
    "totalTests": 12,
    "passed": 10,
    "failed": 2,
    "passRate": "83.3%"
  },
  "details": [
    {"testCase": "Login Page - Valid Credentials", "status": "PASSED", "duration": "1.3s"},
    {"testCase": "Login Page - Invalid Credentials", "status": "PASSED", "duration": "1.2s"},
    {"testCase": "User Registration - Missing Email", "status": "FAILED", "duration": "1.6s"},
    {"testCase": "Cart Checkout - Empty Cart", "status": "FAILED", "duration": "1.8s"}
  ]
}

🧪 Automated Tests
Run all tests:
mvn test

✅ Coverage
Test Class,Description
HelloControllerTest,Validates /api/hello/{name} endpoint
TestReportControllerTest,Validates /api/test-report endpoint

Expected output:
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS

🧰 Tech Stack
Layer,Technology
Backend,Spring Boot 3.4.11
Language,Java 21
Build Tool,Maven
Testing,"JUnit 5, MockMvc, Mockito, AssertJ"
API Format,JSON (REST)


📦 Build for Production
mvn clean package
java -jar target/qa-demo-0.0.1-SNAPSHOT.jar


👤 Author
Amghar Spide
🧠 QA Automation Engineer | Founder, Central Test Agency
📍 New York, USA
🔗 GitHub
