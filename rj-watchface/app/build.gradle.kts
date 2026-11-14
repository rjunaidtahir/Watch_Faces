plugins {
    id("com.android.application")
}

android {
    namespace = "com.junaid.rjwatchface1"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.junaid.rjwatchface1"
        minSdk = 34
        targetSdk = 34
        versionCode = 13
        versionName = "2.6"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            isShrinkResources = false
            signingConfig = signingConfigs.getByName("debug")
        }
    }

    lint {
        checkReleaseBuilds = false
        abortOnError = false
    }
}
