package com.goyeau.jenkins.demo.pipeline.Deploy

import org.jenkinsci.plugins.workflow.cps.CpsScript

class Deploy {

    static frontend(CpsScript s, String version, boolean runTests) {
        s.echo "Deploying frontend from $version. Running tests: $runTests"
    }
}