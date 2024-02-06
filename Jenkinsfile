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
    }
}