package com.github.greengerong.phase

import com.github.greengerong.utils.Pipeline

class PipelineVersionPhase implements Phase {

    def exec(def buildConfig, def params) {
        System.out << Pipeline.version()
        return true
    }
}
