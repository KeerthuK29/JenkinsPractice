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
                    def a = input message: 'Enter the 1st No:', parameters: [defaultValue(defaultValue: '10', description: 'First number')]
                    def b = input message: 'Enter the 2nd No:', parameters: [defaultValue(defaultValue: '60', description: 'Second number')]
                    
                       bat 'javac task23_01_2024.java'
                  
                       bat 'java task23_01_2024 %a% %b%'
                }
            }
        }
    }
}
