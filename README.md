# ElectroHub — Electronic Store Backend

## Overview

ElectroHub is a REST API backend for an electronic commerce application developed using Java and Spring Boot. It handles the core operations of an online store, including user accounts, product and category management, shopping carts, and order processing.

The application uses PostgreSQL for persistent data storage and Spring Data JPA with Hibernate for database interaction. REST endpoints allow a frontend application to communicate with the backend using HTTP requests.

## Technology Stack

- **Language:** Java 17
- **Backend Framework:** Spring Boot 3
- **Database:** PostgreSQL
- **ORM:** Spring Data JPA and Hibernate
- **Security:** Spring Security and JSON Web Tokens (JWT)
- **API Documentation:** OpenAPI and Swagger UI
- **Build Tool:** Maven
- **Validation:** Jakarta Bean Validation

## Core Modules

### 1. User Management

Provides endpoints for user registration, retrieving user information, and updating user details. The application supports user profile information and image uploads.

### 2. Category Management

Handles the creation, retrieval, updating, and deletion of product categories. Categories help organize products within the store.

### 3. Product Management

Provides APIs for managing product information, retrieving product details, and supporting product search and filtering operations.

### 4. Authentication and Authorization

Spring Security and JWT are used to authenticate users and protect secured endpoints. After a successful login, the client uses the returned token when accessing protected resources.

### 5. Role-Based Access Control

The application defines two roles: `NORMAL` and `ADMIN`. Access to restricted operations depends on the authenticated user's assigned role. Administrative operations include managing products and categories.

### 6. Cart Management

Provides backend operations for managing a user's shopping cart and its associated items.

### 7. Order Management

Supports order-related operations that connect the shopping cart workflow with order processing.

## API Documentation

Swagger UI provides an interactive interface for inspecting endpoints, reviewing request and response schemas, and testing API operations.

**Local URL:**

http://localhost:9080/swagger-ui/index.html

The application is configured to run on port `9080`.

## Database Configuration

ElectroHub uses PostgreSQL as its relational database. Database connectivity and JPA behavior are configured through `src/main/resources/application.properties`.

The application is configured to use the `electrohub_db` database locally. Create the database and configure your own database credentials before starting the application.

Sensitive configuration values should be supplied through environment variables or another suitable configuration mechanism rather than committed to version control.

## Running Locally

### Prerequisites

- Java 17
- PostgreSQL
- Maven, or the Maven Wrapper included in the repository
- IntelliJ IDEA or another Java IDE

### Setup

1. Clone or download the repository.
2. Create the PostgreSQL database named `electrohub_db`.
3. Configure the database URL, username, and password in `application.properties`.
4. Open the project in your IDE and allow Maven to resolve its dependencies.
5. Run the Spring Boot application main class.

The application should start on port `9080` when the configuration and database connection are valid.

Open the Swagger UI URL above to inspect the available API endpoints.

## Testing and Verification

The application has been started locally, and the startup logs confirmed database connectivity, JPA initialization, repository discovery, and endpoint registration.

Individual API operations should also be tested to verify their request validation, authentication requirements, authorization rules, and database behavior.

Swagger UI can be used for general API testing. Postman is an alternative for multipart requests, including user registration and image uploads, when those requests are difficult to configure through Swagger UI.

## Current Scope and Future Improvements

The current scope is the backend API for an electronic store. Further development and verification can focus on:

- Adding automated unit and integration tests.
- Improving consistent exception handling and API error responses.
- Reviewing authentication, authorization, and input validation.
- Moving sensitive configuration to environment variables.
- Improving API documentation and request validation.
- Preparing the application for deployment.

## Project Status

The application starts locally and connects to PostgreSQL. Functional testing of individual endpoints, security scenarios, and error cases remains an important part of the development process.