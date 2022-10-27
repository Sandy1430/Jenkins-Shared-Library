@Library ('gitClone') _
pipeline {
     agent any
     tools {
          maven 'maven3'
     }
     stages {
          stage('Pull Code From GitHub') {
               steps {
                    gitClone 'User'
                    sh " echo 'mvnHome = ${mvnHome}' "
               }
          }
          stage ('Maven Stage') {
               steps {   
                    script {
                         mavenBuild.mavenBuild()
                    }
               }     
          }
     }
}
