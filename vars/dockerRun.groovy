def dockerRun () {
  stage ('DOCKER RUN') {
    try{
      sh ' docker rm -f newapp '
    }catch(error) {
      //do nothing on error
    }
    sh ' docker run -d -p "8081:8080" --name newapp $DOCKERHUB_CREDENTIALS_USR/newapp:$BUILD_NUMBER '
  }
}
