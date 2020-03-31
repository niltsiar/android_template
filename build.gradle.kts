// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id(Plugins.gradleVersions) version Versions.gradleVersions
}

buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(BuildTools.androidGradlePlugin)
        classpath(BuildTools.kotlinGradlePlugin)
        classpath(BuildTools.gradleVersions)

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = Versions.targetCompatibility.toString()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

//Configuration for gradle-versions-plugin to avoid non-release versions
//to run: gradlew dependencyUpdates
tasks {
    "dependencyUpdates"(com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask::class) {
        resolutionStrategy {
            componentSelection {
                all {
                    //val rejected = listOf("alpha", "beta", "rc", "cr", "m", "preview")
                    val rejected = listOf("alpha", "cr", "m", "preview")
                        .map { qualifier -> Regex("(?i).*[.-]$qualifier[.\\d-]*") }
                        .any { it.matches(candidate.version) }
                    if (rejected) {
                        reject("Release candidate")
                    }
                }
            }
        }
    }
}
