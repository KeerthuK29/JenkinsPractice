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
                    @echo off

                         echo Enter the 1st No:
                        set /p a=10

                        echo Enter the 2nd No:
                        set /p b=20
                       bat 'java task23_01_2024 %a %b'
                }
            }
        }
    }
}
