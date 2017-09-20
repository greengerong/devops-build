package com.github.greengerong.phase


interface Phase {
    def exec(buildConfig, params)
}