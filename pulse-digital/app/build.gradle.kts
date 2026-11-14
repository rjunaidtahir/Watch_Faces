plugins {
    id("com.android.application")
}

android {
    namespace = "com.junaid.pulsedigital.watchface"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.junaid.pulsedigital.watchface"
        minSdk = 34
        targetSdk = 34
        versionCode = 3
        versionName = "3.0"
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
