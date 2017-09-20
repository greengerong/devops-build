package com.github.greengerong.phase


class DeployPhase implements Phase {

    def exec(buildConfig, params) {
        println 'in DeployPhase exec'
        println "build config: ${buildConfig}"
        println "build params: ${params}"
        System.out << "deploy".execute().inputStream

        return true
    }
}
