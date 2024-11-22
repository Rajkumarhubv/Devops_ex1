pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                
                git 'https://github.com/Rajkumarhubv/Devops_ex1.git'
            }
        }

        stage('Compile') {
            steps {
                
                sh 'javac Signin.java'
            }
        }

        stage('Run Program') {
            steps {
                
                sh 'java Signin'
            }
        }
    }

    post {
        always {
           
            cleanWs()
        }
    }
}
