import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    jacoco
    kotlin("jvm") version Versions.kotlin
}

group = "com.jdiazcano"
version = "1.0-SNAPSHOT"
val mainClass = ""

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

sourceSets.main {
    java {
        setSrcDirs(listOf("src"))
    }
}

sourceSets.test {
    java {
        setSrcDirs(listOf("tst"))
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

// Jacoco configuration
tasks.withType<JacocoCoverageVerification> {
    violationRules {
        rule {
            limit {
                minimum = 0.8.toBigDecimal()
            }
        }
    }
}

tasks.register<Jar>("fatjar") {
    from(Callable { configurations["runtimeClasspath"].map { if (it.isDirectory) it else zipTree(it) } })
}