def dockerRun () {
  stage ('DOCKER RUN') {
      sh ' docker run -d -p "8081:8080" --name newapp $DOCKERHUB_CREDENTIALS_USR/newapp:$BUILD_NUMBER '
  }
}
