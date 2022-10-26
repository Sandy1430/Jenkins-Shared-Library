def mavenBuild(String mvnHome){
    sh '${mvnHome}/bin/mvn clean package'
    sh 'mv target/myweb*.war target/newapp.war'  
}
