plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)

    // Safe args
    id("androidx.navigation.safeargs.kotlin")
}

android {
    namespace = "com.example.teamworkstudentsgeeks15group"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.teamworkstudentsgeeks15group"
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
    // Binding
    buildFeatures.viewBinding = true
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // NavGraph
    val nav_version = "2.7.7"
    //noinspection UseTomlInstead
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    //noinspection UseTomlInstead
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")

    // Binding property delegate
    //noinspection UseTomlInstead
    implementation("com.github.kirich1409:viewbindingpropertydelegate-noreflection:1.5.9")

}