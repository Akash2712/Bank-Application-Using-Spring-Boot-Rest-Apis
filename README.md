This project is a simple bank application implemented using Spring Boot that provides RESTful APIs to perform basic banking operations such as creating users, depositing money, withdrawing money, and deleting users. The application follows a CRUD (Create, Read, Update, Delete) architecture and is designed to be easy to use and extend.

Key Features
User Management:

Create User: Register a new user with essential details such as name and initial balance.
Get User Details: Retrieve information about a specific user.
Delete User: Remove a user from the system.
Transaction Management:

Deposit Money: Add money to a user's account.
Withdraw Money: Subtract money from a user's account.
Check Balance: Retrieve the current balance of a user's account.
Technologies Used
Spring Boot: Framework for building the RESTful APIs.
Spring Data JPA: For database interaction.
H2 Database: In-memory database for simplicity and ease of testing.
Lombok: To reduce boilerplate code.
Maven: For project build and dependency management.
Endpoints
User Management Endpoints:

POST /users: Create a new user.
GET /users/{id}: Retrieve details of a user by ID.
DELETE /users/{id}: Delete a user by ID.
Transaction Management Endpoints:

POST /users/{id}/deposit: Deposit money into a user's account.
POST /users/{id}/withdraw: Withdraw money from a user's account.
GET /users/{id}/balance: Retrieve the balance of a user's account.
Project Structure
Controller Layer: Handles incoming HTTP requests and returns responses to the client.
Service Layer: Contains business logic for handling user and transaction operations.
Repository Layer: Manages data access using Spring Data JPA.
Entity Layer: Defines the data model for the application.
