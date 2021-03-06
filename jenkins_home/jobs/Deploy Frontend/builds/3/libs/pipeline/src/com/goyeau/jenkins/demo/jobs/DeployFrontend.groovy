pipelineJob('Deploy Frontend') {
    parameters {
        stringParam("GitRef", defaultValue = "master")
        booleanParam("RunTests", defaultValue = true)
    }
    definition {
        cps {
            script("""Deploy.frontend(this, GitRef, RunTests.toBoolean)
                     |""".stripMargin())
            sandbox()
        }
    }
}