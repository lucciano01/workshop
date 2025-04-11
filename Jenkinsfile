pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
             sh 'mvn clean package -DskipTests=true'
            }
        }
        stage('Test'){
            steps{
             sh 'mvn test'
            }
        }
        stage('Deploy'){
            steps{
            deploy adapters: [tomcat9(credentialsId: 'TomcatLogin', path: '', url: 'http://localhost:9000/')], contextPath: 'workshop', war: 'target/workshop.war'
            }
        }
    }
}