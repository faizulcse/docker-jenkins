def call(Closure body){
    sh "echo Hello World"
    sh "echo ==> ${body}"
}