🧪 QA Demo – Spring Boot REST API

A professional Spring Boot QA testing demo project designed to simulate real-world backend QA scenarios.
It includes REST endpoints, validation, structured error handling, and automated JUnit 5 + MockMvc tests.

🚀 Features

✅ RESTful API built with Spring Boot 3.4.11

✅ Mock test automation endpoint for QA simulation

✅ JUnit 5 + MockMvc automated tests

✅ Global error handling

✅ Ready-to-deploy Maven setup

✅ Clean code & layered structure

🧩 Project Structure
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

⚙️ Setup & Run
1️⃣ Prerequisites

Java 21

Maven 3.9+

IntelliJ IDEA or VS Code

2️⃣ Run the Application
mvn spring-boot:run


Application will start on:

http://localhost:8080

🧠 API Endpoints
1. GET /api/hello/{name}

Returns a greeting and QA status.

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

2. GET /api/test-report

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
Run All Tests
mvn test

Test Coverage

✅ HelloControllerTest – validates /api/hello/{name}

✅ TestReportControllerTest – validates /api/test-report

Expected output:

Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS

🧰 Tech Stack
Layer	Technology
Backend	Spring Boot 3.4.11
Language	Java 21
Build Tool	Maven
Testing	JUnit 5, MockMvc, AssertJ, Mockito
API Format	JSON (REST)
📦 Build for Production
mvn clean package
java -jar target/qa-demo-0.0.1-SNAPSHOT.jar

👤 Author Amghar 
🧠 QA Automation Engineer
📍 New York, USA
🔗 LinkedIn
 | GitHub
