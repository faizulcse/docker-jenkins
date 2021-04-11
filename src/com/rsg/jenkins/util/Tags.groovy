package com.rsg.jenkins.util

class Tags{
    private runTags
    private skipTags
    private hasValidInput

    Tags() {
        this.runTags = []
        this.skipTags = []
        this.hasValidInput = false
    }

    def tagsToRun(String tags) {
        parse(tags, runTags)
        // set boolean flag to true if there's at least one match, or if field is blank
        (runTags.size() > 0 || tags == "") ? hasValidInput = true : false
    }

    def tagsToSkip(String tags) {
        parse(tags, skipTags)
    }

    def parse(String tags, List list) {
        def matcher = isValid(tags)
        while(matcher.find()) {
            list.add(matcher.group())
        }
    }

    def isValid(String tags) {
        return tags =~ /@([a-zA-Z0-9_-]+)/
    }

    def void print() {
        println(toString())
    }

    def String toString() {
        def run = (this.runTags) ? "-t ${this.runTags.join(",")}" : ""
        def skip = (this. skipTags) ? "${this.skipTags.collect{"-t ~$it"}.join(" ")}" : ""
        return (run + " " + skip)
    }
}
