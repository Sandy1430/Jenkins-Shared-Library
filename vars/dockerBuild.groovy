def dockerBuild () {
  sh ' docker build -t sandy1430/newapp:$BUILD_NUMBER '
}
