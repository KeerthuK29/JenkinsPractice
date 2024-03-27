pipeline{
    agent any
    stages{
        stage('Checkout') {
            steps {
                
                git branch: 'main', url: 'https://github.com/KeerthuK29/JenkinsPractice.git/'
            }
        }
        
                  bat 'javac task23_01_2024.java'
                
            
        
        stage('Run'){
            steps{
                script{
                                      def a = input defaultValue: '4', message: 'Enter the 1st No:'
                    def b = input defaultValue: '3', message: 'Enter the 2nd No:'

                       bat 'javac task23_01_2024.java'
                  
                       bat 'java task23_01_2024 %a% %b%'
                }
            }
        }
    }
}
