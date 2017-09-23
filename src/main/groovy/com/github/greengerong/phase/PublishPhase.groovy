package com.github.greengerong.phase


class PublishPhase implements Phase {

    def exec(buildConfig, params) {
        println 'in PublishPhase exec'
        println "build config: ${buildConfig}"
        println "build params: ${params}"
        // download jar from jenkins master
        //
        System.out << buildConfig.publish.execute().inputStream

        return true
    }
}
