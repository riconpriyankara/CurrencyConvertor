pipeline {

    agent any

    tools {
        maven 'Maven'
        jdk 'JDK25'
    }

    stages {

        stage('Clone') {
            steps {
                git 'https://github.com/riconpriyankara/CurrencyConvertor.git'
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