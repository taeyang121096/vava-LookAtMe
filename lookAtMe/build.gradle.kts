plugins {
	kotlin("jvm") version "1.9.25"
	kotlin("plugin.spring") version "1.9.25"
	id("org.springframework.boot") version "3.4.2"
	id("io.spring.dependency-management") version "1.1.7"
	kotlin("plugin.jpa") version "1.9.25"
//	kotlin("kapt") version "1.9.25"
}

group = "com.vava"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {

	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-validation")
	implementation("org.springframework.boot:spring-boot-starter-web")

	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")

	implementation("com.querydsl:querydsl-jpa:5.0.0")
	implementation("com.querydsl:querydsl-core:5.0.0")

	implementation("com.h2database:h2")

//	kapt("com.querydsl:querydsl-apt:5.0.0:jpa")
//	kapt("jakarta.persistence:jakarta.persistence-api:3.1.0")
//	kapt("jakarta.annotation:jakarta.annotation-api:2.1.1")

	compileOnly("org.projectlombok:lombok")
	annotationProcessor("org.projectlombok:lombok")

	developmentOnly("org.springframework.boot:spring-boot-devtools")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

kotlin {
	compilerOptions {
		freeCompilerArgs.addAll("-Xjsr305=strict")
	}
}

//kapt {
//	arguments {
//		arg("querydsl.generatedSourcesDir", layout.buildDirectory.dir("generated/querydsl").get().asFile.absolutePath)
//	}
//}

sourceSets.main {
	java.srcDirs(layout.buildDirectory.dir("generated/querydsl"))
}

allOpen {
	annotation("jakarta.persistence.Entity")
	annotation("jakarta.persistence.MappedSuperclass")
	annotation("jakarta.persistence.Embeddable")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
