package com.github.greengerong.phase


class BuildPhase implements Phase {

    def exec(buildConfig, params) {
        println 'in BuildPhase exec'
        println "build config: ${buildConfig}"
        println "build params: ${params}"
        System.out << "mvn clean install".execute().inputStream

        return true
    }
}
