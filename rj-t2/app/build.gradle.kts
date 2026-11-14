plugins {
    id("com.android.application")
}

android {
    namespace = "com.junaid.rjtest2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.junaid.rjtest2"
        minSdk = 34
        targetSdk = 34
        versionCode = 5
        versionName = "1.4"
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
