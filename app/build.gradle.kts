plugins {
    id(Plugins.android)
    id(Plugins.kotlinAndroid)
}

val VERSION_MAJOR: String by project
val VERSION_MINOR: String by project
val VERSION_PATCH: String by project
val versionMajor = VERSION_MAJOR.toInt()
val versionMinor = VERSION_MINOR.toInt()
val versionPatch = VERSION_PATCH.toInt()

val appVersionCode = versionMajor * 1_000_000 + versionMinor * 1_000 + versionPatch
val appVersionName = "$versionMajor.$versionMinor.$versionPatch"

android {
    compileSdkVersion(Versions.targetSdk)

    defaultConfig {
        applicationId = "dev.niltsiar.template"
        minSdkVersion(Versions.minSdk)
        targetSdkVersion(Versions.targetSdk)
        versionCode = appVersionCode
        versionName = appVersionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(Libs.kotlinStdlib)
    implementation(Libs.coreKtx)
    implementation(Libs.appCompat)

    testImplementation(Tests.junit)
}
