node('master') {
    stage("Checkout Repository") {
        deleteDir()
        checkout scm
    }

    stage("Generate build_env file"){
        sh "env > ${env.WORKSPACE}/build_env.log"
    }

    stage("Get system env variable") {
        println("JOB_BASE_NAME: ${env.JOB_BASE_NAME}")
        println("WORKSPACE: ${env.WORKSPACE}")
        println("NODE_COUNT: ${env.NODE_COUNT}")
        println("BUILD_NUMBER: ${env.BUILD_NUMBER}")
        println("CUSTOM_HOSTS: ${env.CUSTOM_HOSTS}")
        println("CUCUMBER_TAGS: ${env.CUCUMBER_TAGS}")
        println("SKIP_TAGS: ${env.SKIP_TAGS}")
        println("SHARD: ${env.SHARD}")
        println("Bitrise Token: ${env.BITRISE_TOKEN}")
    }
}