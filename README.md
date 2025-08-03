# Spring Boot JWT Authentication Project

This project demonstrates **JWT authentication with role-based access control (ADMIN & USER)** using Spring Boot, Spring Security, and PostgreSQL.

## 🚀 Features
✅ JWT-based authentication  
✅ Role-based access (`ADMIN` & `USER`)  
✅ REST APIs with secure endpoints  
✅ PostgreSQL integration using Spring Data JPA  
✅ Global Exception Handling  

## 🔗 Endpoints
| Method | Endpoint          | Role Required |
|--------|-------------------|--------------|
| POST   | `/auth/login`     | Public       |
| GET    | `/admin/**`       | ADMIN        |
| GET    | `/user/**`        | USER         |
| GET    | `/public/**`      | Public       |

## 🛠️ Technologies Used
- Spring Boot 3+
- Spring Security 6+
- JWT (io.jsonwebtoken)
- PostgreSQL
- Spring Data JPA

## 📦 How to Run
```sh
mvn spring-boot:run
