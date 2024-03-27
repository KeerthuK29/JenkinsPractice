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
                  def userInput = input(message: 'Enter the 1st No:', parameters: [defaultValue(defaultValue: '10', description: 'First number')])
                    def a = userInput.toString()
                    userInput = input(message: 'Enter the 2nd No:', parameters: [defaultValue(defaultValue: '40', description: 'Second number')])
                    def b = userInput.toString()
                       bat 'java task23_01_2024 %a% %b%'
                }
            }
        }
    }
}
