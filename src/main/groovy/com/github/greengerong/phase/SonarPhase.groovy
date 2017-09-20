package com.github.greengerong.phase


class SonarPhase implements Phase {

    def exec(buildConfig, params) {
        println 'in SonarPhase exec'
        println "build config: ${buildConfig}"
        println "build params: ${params}"
        System.out << "sonar".execute().inputStream

        return true
    }
}
