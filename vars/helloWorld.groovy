def call(Map config = [:]){
    sh "echo Hello World ${config.name}, Today is ${config.dayOfWeek}"
}