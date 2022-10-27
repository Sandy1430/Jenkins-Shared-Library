def mavenBuild () {
    sh '${M2_HOME}/bin/mvn clean package'
    sh 'mv target/myweb*.war target/newapp.war'  
}
