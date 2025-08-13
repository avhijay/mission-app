# **Mission Planning System**
A Spring Boot + Hibernate project for creating, managing, and viewing missions with clearance-based access control.  

# Currently, supports:-->
Mission creation — only registered users can create missions.

User creation and management — **supports basic role-based setup (users/admin)(Database operations)**

**Clearance-based access control** — you must have the required clearance level to view or query a mission.

**Mission access logging** — every access attempt is logged with time, action, and whether it was granted or denied.

**POJO to JSON responses** (partially implemented).

**Exception handling** — in progress, but some global and custom exceptions are already handled.

**Database queries** — using both Spring Data JPA and custom queries where needed.

**Flyway migrations** — database schema versioning.

# Tech Stack----->
**Java 17
Spring Boot 3
Hibernate / JPA
MySQL
Flyway
Maven**

# Future Plans---->

Move to Spring Security **RBAC** for proper role-based restrictions.
Add **search and filtering APIs** for missions.
Complete the exception handling setup.
Implement JavaScript + HTML + CSS frontend for a complete working UI.
Add live feed/video integration for active missions.
Clearance-level based edit restrictions.
More detailed mission categorization (danger level, status flags, etc.).
API documentation (**Swagger** )


# Steps to Run

# 1.Prerequisites
Java 17 installed
Maven installed
MySQL running

### 2.
Create an empty MYSQL database with the name of **"mission_db"**
Update the application.properties
(Table creation is not necessary as flyway would handle that)

# 3.
## Run your application->
"mvn spring-boot:run"

