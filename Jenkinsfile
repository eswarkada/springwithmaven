pipeline {
    agent any
     environment {
    imagename = "eswar1992000/jenkins11"
    registryCredential = 'eswar1992000'
    dockerImage = ''
  }
    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/eswarkada/jenkins1.git'

                // Run Maven on a Unix agent.
              //  sh "mvn -Dmaven.test.failure.ignore=true clean package"
              
              echo "---------------------------------- done ---------------------------"
                // To run Maven on a Windows agent, use
                bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

        }
        stage('Building image') {
            steps{
                script {
                    dockerImage = docker.build imagename
                    //https://faun.pub/docker-build-push-with-declarative-pipeline-in-jenkins-2f12c2e43807
                }
                
            }
            
        }
    }
}
