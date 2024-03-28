pipeline{
    agent any
        parameters {
        string(defaultValue: '10', description: 'First number', name: 'firstNumber')
        string(defaultValue: '40', description: 'Second number', name: 'secondNumber')
    }
    stages{
        stage('Checkout') {
            steps {
                
                git branch: 'main', url: 'https://github.com/KeerthuK29/JenkinsPractice.git/'
            }
        }
        stage('Build'){
              steps{
                  script{
                      bat 'javac task23_01_2024.java'
                  }
              }
        }
            
        
        stage('Run'){
            steps{
                script{
                    bat 'java task23_01_2024 %a% %b%'
                    def a = params.firstNumber
                    def b = params.secondNumber
                }
            }
        }
    }
}
