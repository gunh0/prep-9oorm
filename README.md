# 9oorm Preparation

Server Preparation for 9oormthon

<br/>

### FastAPI Server

**Info**

-   Base environment: `python:3.8-slim`
-   Port: 8000

**Run**

```bash
# Run FastAPI Server
cd fastapi
make up

# Stop FastAPI Server
make down
```

<br/>

### Spring Boot Server (Kotlin)

**Info**

-   Base environment: `openjdk:17.0.2-jdk`
-   Port: 9000

**Run**

```bash
# Run the Spring Boot Server (Kotlin)
cd spring-boot
make up

# Stop the Spring Boot Server (Kotlin)
make down
```

<br/>

### Discription

**Preparing an Automated Container Packaging Environment with Dockerfile and Docker Compose**

In this setup, we have successfully configured an automated container packaging environment using Dockerfile and Docker Compose. This environment allows us to streamline the deployment of our Spring Boot Server (Kotlin) application and FastAPI Server.

**Dockerfile and Docker Compose Files**

We utilize Dockerfile to define the configuration for our Spring Boot Server (Kotlin) application. This Dockerfile specifies the base environment as `openjdk:17.0.2-jdk`, sets the working directory, copies the compiled Spring Boot application JAR file into the container, exposes port 9000, and defines the command to run the application.

Our Docker Compose file coordinates the deployment of both the Spring Boot Server and the FastAPI Server. It ensures that the services run efficiently and are easily managed.

**Usage**

-   To start the Spring Boot Server (Kotlin) and FastAPI Server, navigate to their respective directories and run `make up`.
-   To stop both servers, use `make down`.

This automated container packaging environment simplifies the development and deployment process, making it easier to manage and scale our applications.
