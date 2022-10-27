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
                    sh " echo 'mvnHome = ${M2_HOME}' "
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
