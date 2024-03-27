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
                   // Prompt for user input
                    def a = input defaultValue: '10', message: 'Enter the 1st No:'
                    def b = input defaultValue: '40', message: 'Enter the 2nd No:'
                       bat 'java task23_01_2024 %a% %b%'
                }
            }
        }
    }
}
