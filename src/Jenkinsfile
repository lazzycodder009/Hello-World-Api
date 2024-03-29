pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                sh "mvn -B DSkipTests clean package"
            }
        }
        stage('Test'){
            echo 'This is Test stage'
        }
        satage('Deploy'){
            echo 'deploy stage!!'
        }
    }
}