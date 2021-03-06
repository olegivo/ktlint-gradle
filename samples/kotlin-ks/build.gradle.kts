import org.jlleitschuh.gradle.ktlint.reporter.ReporterType

plugins {
    application
    kotlin("jvm")
    id("org.jlleitschuh.gradle.ktlint")
}

application {
    mainClassName = "org.jlleitschuh.gradle.ktlint.sample.kotlin.MainKt"
}

dependencies {
    compile(kotlin("stdlib"))
}

ktlint {
    verbose.set(true)
    outputToConsole.set(true)
    coloredOutput.set(true)
    reporters {
        reporter(ReporterType.CHECKSTYLE)
        reporter(ReporterType.JSON)
    }
    filter {
        exclude("**/style-violations.kt")
    }
}
