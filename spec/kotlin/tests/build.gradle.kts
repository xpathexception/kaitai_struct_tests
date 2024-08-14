plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

kotlin {
    jvm()
    iosSimulatorArm64()
    macosArm64()
    sourceSets {
        commonMain {
            kotlin.srcDirs(project.rootDir.resolve("../../compiled/kotlin"))
            dependencies {
                implementation(libs.kotlin.stdlib)
                implementation(libs.kotlin.test)
                implementation("io.kaitai.struct:common:0.1.73")
            }
        }
    }
}

task("testClasses")
