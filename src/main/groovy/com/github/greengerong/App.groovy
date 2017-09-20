package com.github.greengerong

class App {

    static void main(def args) {
        def phase = args ? args[0] : ''
        if (!phase) {
            println "Please input your build phase, like devops [build/sonar/hub/publish/deploy/tag...]"
            System.exit 1
        }
        def params = parseParams args
        def factory = new BuildFactory()
        def result = factory.exec phase, params
        if (!result) {
            println 'DevOps build failure, exit with 1.'
            System.exit 1
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
