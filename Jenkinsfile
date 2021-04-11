node('master') {
    stage("Checkout Repository") {
        deleteDir()
        checkout scm
    }
    stage("Get system env variable") {
        println("${env.JOB_BASE_NAME}")
        println("${env.WORKSPACE}")
        println("${env.NODE_COUNT}")
        println("${env.BUILD_NUMBER}")
    }
}