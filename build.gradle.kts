import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm") version Versions.jetbrains.kotlin
}

baseProject(ProjectConfiguration(
        group = "com.jdiazcano",
        version = "1.0-SNAPSHOT"
))

val mainClass = ""

dependencies {
    compileBatch(Premade.kotlin)

    compileBatch(Premade.logging)
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}