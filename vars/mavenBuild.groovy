def mavenBuild () {
    tools {
        maven 'maven3'
    }
    sh '${mvnHome}/bin/mvn clean package'
    sh 'mv target/myweb*.war target/newapp.war'  
}
