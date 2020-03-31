import org.gradle.api.JavaVersion

object Plugins {
    const val android = "com.android.application"
    const val androidLibrary = "com.android.library"
    const val javaLibrary = "java-library"
    const val kotlinAndroid = "kotlin-android"
    const val kotlin = "kotlin"
    const val kapt = "kotlin-kapt"
    const val gradleVersions = "com.github.ben-manes.versions"
    const val navigationKotlin = "androidx.navigation.safeargs.kotlin"
    const val googleServices = "com.google.gms.google-services"
    const val spotless = "com.diffplug.gradle.spotless"
}

object Versions {
    const val kotlin = "1.3.71"
    const val coroutines = "1.3.5"
    const val androidGradlePlugin = "3.6.1"
    const val gradleVersions = "0.28.0"
    const val googleServices = "4.3.3"
    const val spotless = "3.28.0"
    const val ktlint = "0.36.0"

    const val minSdk = 26
    const val targetSdk = 29

    val sourceCompatibility = JavaVersion.VERSION_1_8
    val targetCompatibility = JavaVersion.VERSION_1_8

    const val appCompat = "1.1.0"
    const val coreKtx = "1.2.0"
    const val fragment = "1.2.3"
    const val material = "1.1.0-alpha10"
    const val constraintLayout = "2.0.0-beta4"
    const val lifecycle = "2.2.0"
    const val room = "2.3.5"
    const val navigation = "2.2.1"
    const val drawerLayout = "1.1.0-alpha04"

    const val playServicesMaps = "17.0.0"
    const val playServicesLocation = "17.0.0"

    const val arrow = "0.10.4"
    const val threeTenABP = "1.2.3"
    const val threeTenBP = "1.4.2"
    const val timber = "4.7.1"
    const val moshi = "1.9.2"
    const val retrofit = "2.8.1"
    const val okhttp = "4.4.1"

    const val junit = "4.13"
    const val mockk = "1.9.3"

    const val chucker = "3.1.2"
    const val oklog = "2.3.0"
    const val leakCanary = "2.2"
}

object BuildTools {
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val gradleVersions = "com.github.ben-manes:gradle-versions-plugin:${Versions.gradleVersions}"
    const val navigationSafeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
    const val googleServices = "com.google.gms:google-services:${Versions.googleServices}"
    const val spotless = "com.diffplug.spotless:spotless-plugin-gradle:${Versions.spotless}"
}

object Libs {
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val lifecycle = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"
    const val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    const val drawerLayout = "androidx.drawerlayout:drawerlayout:${Versions.drawerLayout}"

    const val threeTenABP = "com.jakewharton.threetenabp:threetenabp:${Versions.threeTenABP}"
    const val threeTenBP = "org.threeten:threetenbp:${Versions.threeTenBP}:no-tzdb"
    const val arrowCore = "io.arrow-kt:arrow-core:${Versions.arrow}"
    const val arrowSyntax = "io.arrow-kt:arrow-syntax:${Versions.arrow}"
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
    const val moshi = "com.squareup.moshi:moshi:${Versions.moshi}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitMoshi = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
}

object Kapt {
    const val lifecycle = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"
    const val room = "androidx.room:room-compiler:${Versions.room}"
    const val moshiCodegen = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshi}"
    const val arrowMeta = "io.arrow-kt:arrow-meta:${Versions.arrow}"
}

object Tests {
    const val junit = "junit:junit:${Versions.junit}"
    const val mockk = "io.mockk:mockk:${Versions.mockk}"
    const val mockwebserver = "com.squareup.okhttp3:mockwebserver:${Versions.okhttp}"
    const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
}

object DebugLibs {
    const val chucker = "com.github.ChuckerTeam.Chucker:library:${Versions.chucker}"
    const val oklog = "com.github.simonpercic:oklog3:${Versions.oklog}"
    const val okhttpLogginInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"
    const val leakcanary = "com.squareup.leakcanary:leakcanary-android:${Versions.leakCanary}"
}
