package com.github.greengerong.phase

import com.github.greengerong.utils.Shell


class PublishPhase implements Phase {

    def exec(buildConfig, params) {
        println 'in PublishPhase exec'
        println "build config: ${buildConfig}"
        println "build params: ${params}"
        // download jar from jenkins master
        //

        return Shell.execute(buildConfig.publish)
    }
}
