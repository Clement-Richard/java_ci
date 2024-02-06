pipeline {
    agent any

    tools {
        maven 'M3'
    }

    stages {
        stage('Maven Version') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}