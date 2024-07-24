plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "br.com.okayamafilho.taulatesteunitario"
    compileSdk = 34

    defaultConfig {
        applicationId = "br.com.okayamafilho.taulatesteunitario"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)

    testImplementation(libs.junit)
    testImplementation(libs.junit.jupiter)
    testImplementation (libs.truth)
    testImplementation(project(":app"))
    testImplementation(project(":app"))
    testImplementation(project(":app"))
    testImplementation(project(":app"))
    testImplementation(project(":app"))
    testImplementation(project(":app"))
    testImplementation(project(":app"))
    androidTestImplementation (libs.kotlinx.coroutines.test)
    implementation(libs.kotlinx.coroutines.core)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //Mockito
    testImplementation (libs.mockito.core)

}