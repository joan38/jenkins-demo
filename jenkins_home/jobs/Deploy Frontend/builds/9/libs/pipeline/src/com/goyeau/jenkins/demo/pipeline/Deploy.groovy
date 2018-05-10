package com.goyeau.jenkins.demo.pipeline.Deploy

class Deploy {

    static frontend(CpsScript s, String version, boolean runTests) {
        s.echo "Deploying frontend from $version. Running tests: $runTests"
    }
}