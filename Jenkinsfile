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
                    echo 'mvnHome = ${mvnHome}'
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
