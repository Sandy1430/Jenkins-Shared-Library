@Library ('gitClone') _
pipeline {
     agent any
     stages {
          stage('Pull Code From GitHub') {
               steps {
                    gitClone 'User'
               }
          }
          stage ('Maven Stage') {
               steps {
                  script {
                       def mvnHome = tool name: 'maven3' , type: 'maven'
                       maven.mavenBuild('${mvnHome}')
                  }
               }     
          }
     }
}
