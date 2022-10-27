def call () {
      emailext to: 'sandycse96@gmail.com',
      subject: 'Jenkins Build $currentBuild.currentResult: Job $JOB_NAME',
      body: '$currentBuild.currentResult: Job $JOB_NAME build $BUILD_NUMBER\\n More info at: $BUILD_URL'
}
