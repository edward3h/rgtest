plugins {
    application
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(25))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.slf4j:slf4j-api:2.0.17")
    runtimeOnly("io.jstach.rainbowgum:rainbowgum:0.8.2")
    runtimeOnly(project(":rgconfig"))
}

application {
    mainClass = "red.ethel.rgtest.App"
}