def dockerPush () {
  stage ('DOCKER PUSH') {
      sh ' docker login -u $DockerCredentials_USR -p $DockerCredentials_PWS '
      sh ' docker push $DockerCredentials_USR/newapp:$BUILD_NUMBER '
  }
}
