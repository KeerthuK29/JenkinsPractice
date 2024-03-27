pipeline{
    agent any
    stages{
        stage('Checkout') {
            steps {
                
                git branch: 'main', url: 'https://github.com/KeerthuK29/JenkinsPractice.git/'
            }
        }
        
            
        
        stage('Run'){
            steps{
                script{ 
                    def a = input message: 'Enter the 1st No:'
                    def b = input message: 'Enter the 2nd No:'

                       bat 'javac task23_01_2024.java'
                  
                       bat 'java task23_01_2024 %a% %b%'
                }
            }
        }
    }
}
