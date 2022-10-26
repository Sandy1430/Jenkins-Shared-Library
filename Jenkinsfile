@Library ('gitClone') _
pipeline {
     agent any
     stages {
          stage('Pull Code From GitHub') {
               steps {
                    gitClone 'User'
               }
          }
          maven 'user'
     }
}
