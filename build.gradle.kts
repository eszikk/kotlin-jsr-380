plugins {
    val kotlinVersion = "1.3.61"
    java
    kotlin("jvm") version kotlinVersion
    id("org.springframework.boot") version "2.2.2.RELEASE"
    id("io.spring.dependency-management") version "1.0.8.RELEASE"
    kotlin("plugin.spring") version kotlinVersion
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation(kotlin("stdlib-jdk8"))
    testCompile("junit", "junit", "4.12")


    implementation("org.springframework.boot:spring-boot-starter-web")
    //For validation
    //API
    implementation("javax.validation:validation-api:2.0.0.Final")
    //Reference Implementation
    implementation("org.hibernate.validator:hibernate-validator:6.0.2.Final")
    implementation("org.hibernate.validator:hibernate-validator-annotation-processor:6.0.2.Final")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}
