# My Java Project

This is a simple Java project that uses Jenkins and Docker for continuous integration and continuous deployment (CI/CD).

## Prerequisites

- Java 8 or higher
- Maven
- Docker
- Jenkins

## Building the Application

To build the application, run the following command in the project root directory:

```
mvn clean install
```

This will compile the Java code, run the tests, and create a JAR file in the `target` directory.

## Building the Docker Image

To build the Docker image for the application, run the following command in the project root directory:

```
docker build -t my-java-project .
```

This will create a Docker image named `my-java-project` based on the instructions in the `Dockerfile`.

## Running the Application

To run the application, start a Docker container using the image you just built:

```
docker run -p 8080:8080 my-java-project
```

The application will be accessible at `http://localhost:8080`.

## Jenkins Pipeline

The `Jenkinsfile` in the project root directory defines the Jenkins pipeline for this project. It includes stages for building the application, building the Docker image, and deploying the application.

To use the Jenkins pipeline, you need to configure a Jenkins job that points to your repository and specify `Jenkinsfile` as the pipeline script.

## Testing

To run the unit tests, use the following command:

```
mvn test
```

This will run all tests in the `test` directory and output the results to the console.