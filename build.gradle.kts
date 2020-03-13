import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.61"
}

group = "ru.eda.bot"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
    maven(url = "https://jitpack.io")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.telegram:telegrambots:4.6")
    implementation("commons-io:commons-io:2.5")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.10.3")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.10.3")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.10.3")

    testImplementation("org.jetbrains.kotlin:kotlin-test:1.3.70")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5:1.3.70")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}