package com.github.greengerong.phase


class PublishPhase implements Phase {

    def exec(buildConfig, params) {
        println 'in PublishPhase exec'
        println "build config: ${buildConfig}"
        println "build params: ${params}"
        System.out << "publish".execute().inputStream

        return true
    }
}
