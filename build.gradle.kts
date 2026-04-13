plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("com.codeborne:selenide:7.0.4")  // Selenide
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")  // JUnit 5
}

tasks.test {
    useJUnitPlatform()
}