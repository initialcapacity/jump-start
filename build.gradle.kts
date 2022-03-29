plugins {
    kotlin("jvm") version "1.6.10"
    id("org.springframework.boot") version "2.6.5"
    kotlin("plugin.spring") version "1.6.10"
}

group = "io.initialcapacity.weekend"

repositories {
    mavenCentral()
}

val springBootVersion = "2.6.5"
val kotlinVersion = "1.6.10"

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.springframework.boot:spring-boot-starter-web:$springBootVersion")
    implementation("org.springframework.boot:spring-boot-starter-actuator:$springBootVersion")

    testImplementation("org.springframework.boot:spring-boot-starter-test:$springBootVersion")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
