def dockerRun () {
  stage ('DOCKER RUN') {
      sh ' docker run -p "8081:8080" --name newapp DockerCredentials_USR/newapp:$BUILD_NUMBER '
  }
}
