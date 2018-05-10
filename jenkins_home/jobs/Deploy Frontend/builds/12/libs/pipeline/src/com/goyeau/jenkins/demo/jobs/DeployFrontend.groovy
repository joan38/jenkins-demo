pipelineJob('Deploy Frontend') {
    parameters {
        stringParam("GitRef", defaultValue = "master")
        booleanParam("RunTests", defaultValue = true)
    }
    definition {
        cps {
            script("""import com.goyeau.jenkins.demo.pipeline.Deploy
                     |
                     |Deploy.frontend(this, GitRef, RunTests.toBoolean())
                     |""".stripMargin())
            sandbox()
        }
    }
}