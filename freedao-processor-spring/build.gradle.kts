plugins {
    kotlin("jvm")
}

dependencies {
    api(libs.springContext)
    api(projects.freedaoProcessorClassic)

}
//kotlin {
//    jvmToolchain {
//        (this as JavaToolchainSpec).languageVersion.set(JavaLanguageVersion.of(8))
//    }
//}
