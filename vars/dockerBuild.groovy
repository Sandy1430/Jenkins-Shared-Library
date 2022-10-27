def dockerBuild () {
  stage ('DOCKER BUILD') {
    steps {
      sh ' docker build -t sandy1430/newapp:$BUILD_NUMBER '
    }
  }
}
