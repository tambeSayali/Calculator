pipeline {
    agent any

    environment {
        SONARQUBE = 'MySonarQubeServer' // Name configured in Jenkins > Manage Jenkins > Configure System
    }

    tools {
        maven 'Maven 3.8.1' // Name configured in Jenkins > Global Tool Configuration
        jdk 'JDK 11'        // Adjust based on your project
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/tambeSayali/Calculator.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('MySonarQubeServer') {
                    sh 'mvn sonar:sonar'
                }
            }
        }

        stage('Selenium Tests') {
            steps {
                sh 'mvn test -Dtest=YourSeleniumTestClass'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
