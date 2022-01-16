plugins {
    kotlin("jvm") version "1.6.10"
    kotlin("plugin.serialization") version "1.6.10"
    id("maven-publish")
}


publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.enchantinggg4"
            artifactId = "kingdomrpg"
            version = "1.1"

            from(components["java"])
        }
    }
}

group = "com.github.enchantinggg4"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        setUrl("https://jitpack.io")
    }
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2")
    implementation("com.github.jitpack:gradle-simple:1.0")
}

tasks.register("install") {
    finalizedBy("build")
}