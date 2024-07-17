# Loan Account API
### Overview
This project is a Spring Boot application that integrates with an external API to retrieve loan account details, stores the data in a database, and exposes the information through a REST API endpoint.

## Setup Instructions
### Prerequisites 
1. Java 11 or higher
2. Maven
3. MySQL or any other preferred RDBMS

### Steps to Setup
 1. Clone the repository 
```bash
git clone https://github.com/ironman2211/mobipay
cd mobipay
```
 2. Configure the Database
Open src/main/resources/application.properties and configure the database URL, username, and password as per your setup.

### properties

```json

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/accounts_db
spring.datasource.username=USERNAME
spring.datasource.password=YOURPASS
spring.jpa.hibernate.ddl-auto=update
spring.datasource.hikari.maximum-pool-size=10
spring.datasource.hikari.minimum-idle=5


accounts.url=http://demo0951179.mockable.io/loanaccount
```
### Build the Project
```bash
mvn clean install
```
### Run the Application
```bash
mvn spring-boot:run
```
The application will start and be available at http://localhost:8080.