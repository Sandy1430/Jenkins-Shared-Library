def call () {
      emailext to: 'sandycse96@gmail.com' ,
      subject: 'Jenkins Build ${currentBuild.currentResult}: Job ${env.JOB_NAME}'
      body: '${currentBuild.currentResult}: Job ${env.JOB_NAME} build ${env.BUILD_NUMBER}\\n More info at: ${env.BUILD_URL}'
}
