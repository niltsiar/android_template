plugins {
    id(Plugins.android)
    id(Plugins.kotlinAndroid)
}

android {
    compileSdkVersion(Versions.targetSdk)

    defaultConfig {
        applicationId = "dev.niltsiar.template"
        minSdkVersion(Versions.minSdk)
        targetSdkVersion(Versions.targetSdk)
        versionCode = 1
        versionName = "1.0"

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
