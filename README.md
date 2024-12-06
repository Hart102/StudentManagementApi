# studentManagementApi

A Spring Boot API for managing student records, providing endpoints to perform CRU operations.

---

## Features

- **Add a Student**: Create new student records.
- **Get All Students**: Retrieve a list of all students.
- **Get Student by ID**: Fetch detailed information about a specific student.
- **Update a Student**: Modify details of an existing student.
- **Delete a Student**: Remove a student record from the database.

---

## Tech Stack

- **Backend Framework**: Spring Boot
- **Language**: Java
- **Database**: MySQL
- **Build Tool**: Maven

### Prerequisites

- **Java** (JDK 17 or above recommended)
- **Maven** (for building the project)
- A MySQL database configured for the application.

### API Endpoints
HTTP Method	Endpoint	              Description
- POST	    /students	              Add a new student
- GET	    /students	              Get all students
- GET	    /students/student/{id}	  Get a student by ID
- PUT	    /students/{id}	          Update student details
- DELETE	/students/delete/{id}	  Delete a student
