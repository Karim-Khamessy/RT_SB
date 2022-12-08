job('Hello World') {
   pipeline {
        agent any
        stages {
           stage('Build') {
            steps {
                shell('Here is the build stage')
            }
        }
            stage('Test') {
                steps {

                    sh 'mvn test'
                }
              
            }
        
         
        }
    }
}