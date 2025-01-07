# Course Management System

## Overview
This is a Spring Boot-based application for managing courses, students, reviews, and their relationships. The application allows CRUD operations for courses, students, reviews, and passports, along with managing many-to-many and one-to-one relationships.

## Features
- **Course Management**: Create, view, update, and delete courses.
- **Student Management**: Add students, assign courses, and manage enrolled courses.
- **Review System**: Add, view, and delete reviews for courses.
- **Passport Management**: Manage student passports with one-to-one relationships.

## Project Structure
### Entity Classes
- **`Course`**: Represents courses offered. Includes relationships with `Student` (Many-to-Many) and `Review` (One-to-Many).
- **`Student`**: Represents students. Includes relationships with `Course` (Many-to-Many) and `Passport` (One-to-One).
- **`Review`**: Represents reviews for courses. Linked to `Course` (Many-to-One).
- **`Passport`**: Represents passports associated with students.

### Repository Interfaces
- **`CourseRepository`**: CRUD operations for `Course`.
- **`StudentRepository`**: CRUD operations for `Student`.
- **`ReviewRepository`**: CRUD operations for `Review`.
- **`PassportRepository`**: CRUD operations for `Passport`.

### Service Classes
- **`CourseService`**: Handles business logic for `Course`.
- **`StudentService`**: Handles business logic for `Student`.
- **`ReviewService`**: Handles business logic for `Review`.
- **`PassportService`**: Handles business logic for `Passport`.

### Controllers
- **`CourseController`**: Endpoints for managing courses.
- **`StudentController`**: Endpoints for managing students and their courses.
- **`ReviewController`**: Endpoints for adding, viewing, and deleting reviews.
- **`PassportController`**: Endpoints for adding and managing student passports.

## File Structure
```
src/main/java
├── com.example.coursemanagement
│   ├── controller
│   │   ├── CourseController.java
│   │   ├── StudentController.java
│   │   ├── ReviewController.java
│   │   └── PassportController.java
│   ├── entity
│   │   ├── Course.java
│   │   ├── Student.java
│   │   ├── Review.java
│   │   └── Passport.java
│   ├── repository
│   │   ├── CourseRepository.java
│   │   ├── StudentRepository.java
│   │   ├── ReviewRepository.java
│   │   └── PassportRepository.java
│   ├── service
│   │   ├── CourseService.java
│   │   ├── StudentService.java
│   │   ├── ReviewService.java
│   │   └── PassportService.java
│   └── CourseManagementApplication.java
```

### Templates
- **`course-list.html`**: Displays a list of courses.
- **`course-detail.html`**: Displays course details along with reviews.
- **`course-form.html`**: Form to add or update a course.
- **`student-list.html`**: Displays a list of students.
- **`student-form.html`**: Form to add a student.
- **`review-form.html`**: Form to add a review.
- **`passport-form.html`**: Form to add a passport.

## Prerequisites
- Java 17+
- Spring Boot
- Maven
- MySQL or H2 Database

## Getting Started
1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```bash
   cd course-management
   ```
3. Configure the database in `application.properties`.
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## Endpoints
### Course Endpoints
- `GET /courses` - List all courses
- `GET /courses/{id}` - View course details
- `GET /courses/add` - Add a new course (form)
- `POST /courses/save` - Save a course

### Student Endpoints
- `GET /students` - List all students
- `GET /students/add` - Add a new student (form)
- `POST /students/save` - Save a student
- `GET /students/{id}/courses` - View courses of a student
- `GET /students/{id}/addCourses` - Add courses to a student

### Review Endpoints
- `GET /reviews/add?id={courseId}` - Add a review for a course (form)
- `POST /reviews/save` - Save a review
- `GET /reviews/remove?id={reviewId}&cid={courseId}` - Remove a review

### Passport Endpoints
- `GET /passports/add?id={studentId}` - Add a passport for a student (form)
- `POST /passports/save` - Save a passport

## License
This project is licensed under the MIT License. Feel free to use and modify it as needed.

## Author
[PUSHKAR D](https://github.com/pushkar666)
