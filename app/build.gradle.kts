plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.stargatex.versioncatalog"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.stargatex.versioncatalog"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        named("release") {
            isMinifyEnabled = false
            setProguardFiles(listOf(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"))
        }
    }


    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation (libs.core.ktx)
    implementation (libs.appcompat)
    implementation (libs.material)
    implementation (libs.constraintlayout)
    implementation (libs.navigation.fragment.ktx)
    implementation (libs.navigation.ui.ktx)
    testImplementation (libs.junit)
    androidTestImplementation (libs.ext.junit)
    androidTestImplementation (libs.espresso.core)
}