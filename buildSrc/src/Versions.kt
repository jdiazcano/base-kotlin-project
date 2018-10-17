object Versions {
    val kotlin: String = "1.2.71"
    object jetbrains {
        val kotlin = "1.2.71"
        val spek = "1.1.2"
        val engine = "1.2.0"
    }
    val bytebuddy = "1.8.15"
    val klaxon = "3.0.6"
    val typesafe = "1.3.3"
    val jgit = "4.9.0.201710071750-r"
    val expekt = "0.5.0"
    val junitrunner = "1.1.0-M1"
    val snakeyaml = "1.21"
    val jcommander = "1.72"
    val mockwebserver = "3.11.0"
    val aws = "1.11.380"
    val logging = "1.5.4"
}

object Libraries {
    object Eclipse {
        val jgit = "org.eclipse.jgit:org.eclipse.jgit:${Versions.jgit}"
    }

    object jetbrains {
        object kotlin {
            val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.jetbrains.kotlin}"
            val reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.jetbrains.kotlin}"
            val test = "org.jetbrains.kotlin:kotlin-test:${Versions.jetbrains.kotlin}"
        }

        object spek {
            val api = "org.jetbrains.spek:spek-api:${Versions.jetbrains.engine}"
            val engine = "org.jetbrains.spek:spek-junit-platform-engine:${Versions.jetbrains.engine}"
        }
    }

    val junitrunner = "org.junit.platform:junit-platform-runner:${Versions.junitrunner}"
    val expekt = "com.winterbe:expekt:${Versions.expekt}"
    val bytebuddy = "net.bytebuddy:byte-buddy:${Versions.bytebuddy}"
    val typesafe = "com.typesafe:config:${Versions.typesafe}"
    val snakeyaml = "org.yaml:snakeyaml:${Versions.snakeyaml}"
    val klaxon = "com.beust:klaxon:${Versions.klaxon}"
    val jcommander = "com.beust:jcommander:${Versions.jcommander}"
    val mockwebserver = "com.squareup.okhttp3:mockwebserver:${Versions.mockwebserver}"
    val logging = "io.github.microutils:kotlin-logging:${Versions.logging}"

    object aws {
        val s3 = "com.amazonaws:aws-java-sdk-s3:${Versions.aws}"
        val sqs = "com.amazonaws:aws-java-sdk-sqs:${Versions.aws}"
        val sns = "com.amazonaws:aws-java-sdk-sns:${Versions.aws}"
    }
}