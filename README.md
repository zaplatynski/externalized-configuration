# externalized-configuration

## Overview
The `externalized-configuration` project is a Spring Boot REST service that implements the externalized configuration pattern. It allows for the management of key-value pairs with stage references, supporting string, number, and boolean values. The project utilizes the Eclipse Store for the persistence layer and includes paged read operations for configuration items.

## Features
- Externalized configuration management
- Support for string, number, and boolean values
- Stage references for configuration items
- RESTful API for configuration item retrieval
- Paged read operations for efficient data access

## Technologies Used
- Spring Boot 3.4.3
- Eclipse Store 2.1.1
- Maven for project management

## Setup Instructions
1. Clone the repository:
   ```
   git clone <repository-url>
   cd externalized-configuration
   ```

2. Build the project using Maven:
   ```
   ./mvnw clean install
   ```

3. Run the application:
   ```
   ./mvnw spring-boot:run
   ```

4. Access the API at `http://localhost:8080/api/config`.

## Usage
- To retrieve configuration items, send a GET request to `/api/config`.
- For paged results, include query parameters for pagination, such as `?page=0&size=10`.

## License
This project is licensed under the MIT License.