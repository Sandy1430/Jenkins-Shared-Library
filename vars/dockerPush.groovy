def dockerPush () {
  stage ('DOCKER PUSH') {
      sh 'echo $DOCKERHUB_CREDENTIALS_PSW | sudo docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
      sh ' docker push $DockerCredentials_USR/newapp:$BUILD_NUMBER '
  }
}
