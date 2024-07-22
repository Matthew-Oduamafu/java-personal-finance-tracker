plugins {
    java
    id("org.springframework.boot") version "3.3.2"
    id("io.spring.dependency-management") version "1.1.6"
}

group = "io.nerdbyteslns"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    runtimeOnly("com.mysql:mysql-connector-j")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // for validation
    implementation("org.springframework.boot:spring-boot-starter-validation:3.3.2")

    //for swagger
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.6.0")
//    implementation("io.springfox:springfox-boot-starter:3.0.0")

    // for openapi configs
    implementation("org.springdoc:springdoc-openapi-ui:1.6.9")

    // for servlet (for openapi configs)
    implementation("jakarta.servlet:jakarta.servlet-api:4.0.4")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
