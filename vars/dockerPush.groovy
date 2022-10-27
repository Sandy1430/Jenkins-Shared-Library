def dockerPush () {
  stage ('DOCKER PUSH') {
      sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
      sh ' docker push $DOCKERHUB_CREDENTIALS_USR/newapp:$BUILD_NUMBER '
      sh ' docker rm -f $(docker ps -q) '
      sh ' docker rmi -f $(docker images -a -q) '
  }
}
