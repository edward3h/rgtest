plugins {
    `java-library`
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
    annotationProcessor("io.avaje:avaje-spi-service:2.12")
    implementation("io.avaje:avaje-spi-service:2.12")
    implementation("io.jstach.rainbowgum:rainbowgum-core:0.8.2")
    implementation("io.jstach.rainbowgum:rainbowgum-pattern:0.8.2")
}