pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                sh "mvn -B DSkipTests clean package"
            }
        }
        stage('Test'){
            steps{
                echo 'This is Test stage'
            }
            
        }
        stage('Deploy'){
            steps{
                echo 'deploy stage!!'
            }
            
        }
    }
}