@Library ('gitClone') _

pipeline {
     agent any
     tools {
          maven 'maven3'
     }
     environment {
          DOCKERHUB_CREDENTIALS= credentials('DockerPass')     
     }
     stages {
          stage('Pull Code From GitHub') {
               steps {
                    gitClone 'User'
               }
          }
          stage ('Maven Stage') {
               steps {   
                    script {
                         mavenBuild.mavenBuild()
                    }
               }     
          }
          stage ('Docker Build and Push') {
               steps {   
                    script {
                         dockerBuild.dockerBuild()
                         dockerPush.dockerPush()
                         dockerRun.dockerRun()
                    }
               }     
          }
     }
}
