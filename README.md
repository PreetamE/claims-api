# Claims API

A simple Spring Boot RESTful API to fetch insurance claim details using in-memory data.

---

##  Features

- REST API endpoint to retrieve a claim by its ID
- In-memory storage using `Map<Long, Claim>`
- Returns:
  - `200 OK` with claim details if found
  - `404 Not Found` if no claim exists for the given ID

---
# Project Structure

src/
├── main/
│   └── java/
│       └── com/example/claims/
│           ├── controller/
│           │   └── ClaimController.java
│           ├── model/
│           │   ├── Claim.java
│           │   └── ClaimStatus.java
│           ├── service/
│           │   └── ClaimService.java
│           └── ClaimsApiApplication.java

---
## Getting Started

### Prerequisites
- Java 17 or higher
- Maven
- Git (if cloning from GitHub)
- Postman or Curl (for API testing)

---

###  How to Run Locally

#### Option 1: Using IntelliJ
1. Open the project in IntelliJ
2. Right-click `ClaimsApiApplication.java` → Run

---
#API Endpoint
## GET /Api/claims/{id}

### Example Response:

{
  "id": 1,
  "claimNumber": "CLM001",
  "claimAmount": 1000.00,
  "claimStatus": "SUBMITTED",
  "submittedDate": "2025-06-24"
}

## When Not Found

GET http://localhost:8080/api/claims/999

### Response: 404 Not Found
---
#Deploymnet 

To deploy or share this project:

- Zip the entire folder
- Or push it to GitHub
