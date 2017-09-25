package com.github.greengerong.phase

import com.github.greengerong.utils.Shell


class HubPhase implements Phase {

    def exec(buildConfig, params) {
        println 'in HubPhase exec'
        println "build config: ${buildConfig}"
        println "build params: ${params}"

        return Shell.execute("hub")
    }
}
