package com.github.greengerong.phase

import com.github.greengerong.utils.Shell

class DeployPhase implements Phase {

    def exec(buildConfig, params) {
        println 'in DeployPhase exec'
        println "build config: ${buildConfig}"
        println "build params: ${params}"

        return Shell.execute("deploy")
    }
}
