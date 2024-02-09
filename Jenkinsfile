pipeline {
    agent any

    tools {
        maven 'M3'
    }

    stages {
        stage('Maven Version') {
            steps {
                bat 'mvn --version'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }
}