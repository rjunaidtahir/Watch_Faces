plugins {
    id("com.android.application")
}

android {
    namespace = "com.junaid.rjtest3"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.junaid.rjtest3"
        minSdk = 34
        targetSdk = 34
        versionCode = 3
        versionName = "1.2"
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
