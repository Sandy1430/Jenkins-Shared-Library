def call () {
      emailext to: 'sandycse96@gmail.com',
      subject: 'Jenkins Build $BUILD_STATUS: Job $JOB_NAME',
      body: '$BUILD_STATUS: Job $JOB_NAME build $BUILD_NUMBER \\n More info at: $BUILD_URL'
}
