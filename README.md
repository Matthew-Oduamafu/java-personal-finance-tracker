## Personal Finance Tracker

Personal Finance Tracker is a Spring Boot application designed to help users manage their personal finances. It provides features for tracking income, expenses, and generating financial reports.

### Features

- Track income and expenses
- Generate financial reports
- User authentication and authorization
- RESTful API
- Swagger UI for API documentation

### Technologies Used

- Java 17
- Spring Boot 3.3.2
- Spring Data JPA
- MySQL
- Gradle
- Swagger (Springdoc OpenAPI)

### Getting Started

#### Prerequisites

- Java 17
- MySQL
- Gradle

#### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/personalfinancetracker.git
    cd personalfinancetracker
    ```

2. Configure the database:
    - Create a MySQL database named `personalfinancetracker_db`.
    - Update the database configuration in `src/main/resources/application.properties` if necessary.

3. Build the project:
    ```sh
    ./gradlew build
    ```

4. Run the application:
    ```sh
    ./gradlew bootRun
    ```

5. Access the application:
    - The application will be available at `http://localhost:8080`.
    - Swagger UI can be accessed at `http://localhost:8080/swagger-ui.html`.

### Configuration

The application can be configured using the `src/main/resources/application.properties` file. Key configurations include:

- `spring.datasource.url`: Database URL
- `spring.datasource.username`: Database username
- `spring.datasource.password`: Database password
- `spring.jpa.hibernate.ddl-auto`: Hibernate DDL mode
- `spring.jpa.properties.hibernate.dialect`: Hibernate dialect

### Building and Running Tests

To run tests, use the following command:
```sh
./gradlew test
