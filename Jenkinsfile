pipeline{
    agent any
    tools{
        maven 'Maven 3.9'
    }
    stages{
        stage('Build'){
            steps{
                sh "mvn -B -DskipTests clean package"
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