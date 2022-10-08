@file:Suppress("MagicNumber", "SpellCheckingInspection")

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm") version "1.7.20"
  checkstyle
  id("com.github.sherter.google-java-format") version "0.9"
  id("org.jmailen.kotlinter") version "3.12.0"
  id("com.github.cs125-illinois.questioner") version "2022.10.2"
  id("com.github.ben-manes.versions") version "0.42.0"
  id("io.gitlab.arturbosch.detekt") version "1.21.0"
}
repositories {
  mavenLocal()
  mavenCentral()
  maven("https://jitpack.io")
  maven("https://maven.codeawakening.com")
}
dependencies {
  implementation(kotlin("stdlib"))
  implementation("com.github.cs125-illinois.questioner:lib:2022.10.2")
}
tasks.withType<Test> {
  useJUnitPlatform()
  enableAssertions = true
  jvmArgs(
    "-ea", "-Xms4G", "-Xmx8G", "--enable-preview", "-XX:+UseZGC",
    "-Dfile.encoding=UTF-8",
    "-XX:-OmitStackTraceInFastThrow",
    "--add-opens", "java.base/java.lang=ALL-UNNAMED",
    "--add-opens", "java.base/java.util=ALL-UNNAMED",
    "--add-exports", "jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED",
    "--add-exports", "jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED",
    "--add-exports", "jdk.compiler/com.sun.tools.javac.parser=ALL-UNNAMED",
    "--add-exports", "jdk.compiler/com.sun.tools.javac.tree=ALL-UNNAMED",
    "--add-exports", "jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED",
    "--add-exports", "java.management/sun.management=ALL-UNNAMED"
  )
}
googleJavaFormat {
  toolVersion = "1.15.0"
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
  maxMutationCount = 256
}
kotlinter {
  disabledRules = arrayOf("filename", "package-name")
}
tasks.withType<KotlinCompile> {
  kotlinOptions {
    jvmTarget = JavaVersion.VERSION_17.toString()
  }
}
