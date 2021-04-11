import com.rsg.jenkins.util.Tags

node('master') {
    stage("Checkout Repository") {
        deleteDir()
        checkout scm
    }

//    stage("Generate build_env file"){
//        sh "env > ${env.WORKSPACE}/build_env.log"
//    }
    println("${env.CUCUMBER_TAGS}")
    def tags = new Tags();
    tags.tagsToRun(env.CUCUMBER_TAGS)
    def tagCommand = tags.toString()
    println("${tagCommand}")

    stage("Get system env variable") {
        println("JOB_BASE_NAME: ${env.JOB_BASE_NAME}")
        println("WORKSPACE: ${env.WORKSPACE}")
        println("NODE_COUNT: ${env.NODE_COUNT}")
        println("BUILD_NUMBER: ${env.BUILD_NUMBER}")
//        println("CUSTOM_HOSTS: ${env.CUSTOM_HOSTS}")
        println("CUCUMBER_TAGS: ${env.CUCUMBER_TAGS}")
//        println("SKIP_TAGS: ${env.SKIP_TAGS}")
//        println("SHARD: ${env.SHARD}")
//        println("BITRISE_TOKEN: ${env.BITRISE_TOKEN}")

        println("PWD: ${env.PWD}")
        println("STAGE_NAME: ${env.STAGE_NAME}")
        println("WORKSPACE: ${env.WORKSPACE}")
        println("HOME: ${env.HOME}")
        println("USER: ${env.USER}")
        println("JENKINS_HOME: ${env.JENKINS_HOME}")
        println("NODE_NAME: ${env.NODE_NAME}")
        println("BUILD_TAG: ${env.BUILD_TAG}")
    }
}