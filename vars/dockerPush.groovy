def dockerPush () {
  stage ('DOCKER PUSH') {
      sh ' echo $DockerCredentials_PWS | docker login -u $DockerCredentials_USR --password-stdin '
      sh ' docker push $DockerCredentials_USR/newapp:$BUILD_NUMBER '
  }
}
