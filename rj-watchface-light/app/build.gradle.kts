plugins {
    id("com.android.application")
}

android {
    namespace = "com.junaid.rjwatchface2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.junaid.rjwatchface2"
        minSdk = 34
        targetSdk = 34
        versionCode = 2
        versionName = "1.1"
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
