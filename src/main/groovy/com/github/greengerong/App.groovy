package com.github.greengerong

class App {
    static final VERSION = "1.0.0"

    static void main(def args) {
        def phase = args ? args[0] : ''
        if (!phase) {
            println "Please input your build phase, like devops [build/sonar/hub/publish/deploy/tag...]"
            System.exit 1
        }
        dummyVersion phase
        def params = parseParams args
        def factory = new BuildFactory()
        def result = factory.exec phase, params
        if (!result) {
            println 'DevOps build failure, exit with 1.'
            System.exit 1
        }
    }

    static def dummyVersion(phase) {
        if (phase == 'version') {
            println "DevOps build version ${VERSION}."
            System.exit 0
        }
    }

    private static def parseParams(args) {
        def paramList = args.size() > 1 ? args[1..-1] : []
        paramList.collectEntries {
            def sp = it.split '='
            [sp[0], sp[1]]
        }
    }
}
