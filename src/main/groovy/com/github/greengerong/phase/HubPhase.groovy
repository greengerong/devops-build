package com.github.greengerong.phase


class HubPhase implements Phase {

    def exec(buildConfig, params) {
        println 'in HubPhase exec'
        println "build config: ${buildConfig}"
        println "build params: ${params}"
        System.out << "hub".execute().inputStream

        return true
    }
}
