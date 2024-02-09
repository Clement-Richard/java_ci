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
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}