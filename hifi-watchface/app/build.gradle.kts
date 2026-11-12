plugins {
    id("com.android.application")
}

android {
    namespace = "com.junaid.hifistereo.watchface"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.junaid.hifistereo.watchface"
        minSdk = 33
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
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
