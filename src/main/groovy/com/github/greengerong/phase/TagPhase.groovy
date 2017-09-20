package com.github.greengerong.phase


class TagPhase implements Phase {

    def exec(buildConfig, params) {
        println 'in TagPhase exec'
        println "build config: ${buildConfig}"
        println "build params: ${params}"
        System.out << "tag".execute().inputStream

        return true
    }
}
