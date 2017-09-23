package com.github.greengerong.phase


class BuildPhase implements Phase {

    def exec(buildConfig, params) {

        System.out << buildConfig.build.command.execute().inputStream

        return true
    }
}
