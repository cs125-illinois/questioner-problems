@file:Suppress("MagicNumber", "SpellCheckingInspection")

plugins {
    kotlin("jvm") version "1.6.10"
    checkstyle
    id("com.github.sherter.google-java-format") version "0.9"
    id("org.jmailen.kotlinter") version "3.8.0"
    id("com.github.cs125-illinois.questioner") version "2022.1.0"
    id("com.github.ben-manes.versions") version "0.39.0"
    id("io.gitlab.arturbosch.detekt") version "1.19.0"
}
repositories {
    mavenLocal()
    mavenCentral()
    maven("https://jitpack.io")
    maven("https://maven.pkg.jetbrains.space/public/p/kotlinx-html/maven")
}
dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.github.cs125-illinois.questioner:lib:2022.1.0")
}
tasks.withType<Test> {
    useJUnitPlatform()
    enableAssertions = true
    jvmArgs("--enable-preview", "-Dfile.encoding=UTF-8")
}
googleJavaFormat {
    toolVersion = "1.10.0"
}
checkstyle {
    toolVersion = "8.45"
}
tasks.dependencyUpdates {
    fun String.isNonStable() = !(
        listOf("RELEASE", "FINAL", "GA", "JRE").any { toUpperCase().contains(it) }
            || "^[0-9,.v-]+(-r)?$".toRegex().matches(this)
        )
    rejectVersionIf { candidate.version.isNonStable() }
    gradleReleaseChannel = "current"
}
detekt {
    buildUponDefaultConfig = true
}
tasks.check {
    dependsOn("detekt", "checkstyleMain", "googleJavaFormat", "test")
}
questioner {
    seed = 124
}
