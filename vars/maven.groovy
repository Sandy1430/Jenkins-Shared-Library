def mavenBuild(String mvnHome){
 stage ('Maven Build') {
    sh '${mvnHome}/bin/mvn clean package'
    sh 'mv target/myweb*.war target/newapp.war'  
 }
}
