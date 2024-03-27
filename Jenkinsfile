pipeline{
    agent any
    stages{
        stage('Checkout') {
            steps {
                
                git branch: 'main', url: 'https://github.com/KeerthuK29/JenkinsPractice.git/'
            }
        }
        stage('Build'){
            steps{
                script {
                  bat 'javac task23_01_2024.java'
                }
            }
        }
        stage('Run'){
            steps{
                script{
                    bat 'java task23_01_2024'
                }
            }
        }
    }
}
