libraries {
     lib('gitClone')
 }
pipeline {
     agent any
     stages {
          stage('Pull Code From GitHub') {
               steps {
                    step {
                         script {
                              git
                         }
                    }
               }
          }
     }
}
