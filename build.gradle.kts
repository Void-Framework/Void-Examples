plugins {
    kotlin("jvm") version "2.2.21"
}

group = "io.void"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(url = "https://jitpack.io")
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.github.Jadiefication:Void:v2.1.0")
    implementation("com.github.Jadiefication:Void-HTML:v1.1.0")
}

kotlin {
    jvmToolchain(24)
}

tasks.test {
    useJUnitPlatform()
}