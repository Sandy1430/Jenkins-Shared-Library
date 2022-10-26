@Library('gitClone') _

pipeline {
  agent any 
  stages {
    stage('clone and build'){
      steps{
        git
        maven
      }
    }
  }
}
