package com.github.greengerong.phase

import com.github.greengerong.utils.Shell


class BuildPhase implements Phase {

    def exec(buildConfig, params) {
        return Shell.execute(buildConfig.build.command)
    }

}
