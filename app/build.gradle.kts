plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("com.google.devtools.ksp")
    id("dagger.hilt.android.plugin")
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.20"
}

android {
    compileSdk = 34
    buildToolsVersion = "34.0.0"
    namespace = "com.example.cryptoapp"

    defaultConfig {
        applicationId = "com.example.cryptoapp"
        minSdk = 27
        targetSdk = 34
        versionCode = 1
        versionName = "1.0.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isShrinkResources = true
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            isShrinkResources = true
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
    buildFeatures {
        compose = true
    }
    composeCompiler {
        reportsDestination = layout.buildDirectory.dir("compose_compiler")
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

val appCompatVersion by extra("1.7.0")
val coreKtxVersion by extra("1.13.1")
val lifeCycleAndLiveDataCompilerAndViewModelKTXVersion by extra("2.8.6")
val swipeRefreshLayoutVersion by extra("1.1.0")
val activityVersion by extra("1.9.2")
val fragmentVersion by extra("1.8.3")
val retrofitVersion by extra("2.11.0")
val okHttpVersion by extra("4.12.0")
val coroutineVersion by extra("1.9.0")
val materialDesignVersion by extra("1.12.0")
val hiltVersion by extra("2.52")
val hiltCompilerVersion by extra("1.2.0")
val composeVersion by extra("1.7.2")
val composeFoundationVersion by extra("1.7.2")
val composeMaterialVersion by extra("1.7.2")
val composeMaterial3Version by extra("1.3.0")
val composeNavigationVersion by extra("2.8.1")
val composeHiltNavigationVersion by extra("1.2.0")

dependencies {
    //Architecture Library
    implementation("androidx.activity:activity-ktx:$activityVersion")
    implementation("androidx.fragment:fragment-ktx:$fragmentVersion")
    implementation("androidx.appcompat:appcompat:$appCompatVersion")
    implementation("androidx.core:core-ktx:$coreKtxVersion")
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:$swipeRefreshLayoutVersion")
    //View Model KTX and LiveData and Live Cycle
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifeCycleAndLiveDataCompilerAndViewModelKTXVersion")
    //noinspection LifecycleAnnotationProcessorWithJava8
    kapt("androidx.lifecycle:lifecycle-compiler:$lifeCycleAndLiveDataCompilerAndViewModelKTXVersion")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifeCycleAndLiveDataCompilerAndViewModelKTXVersion")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifeCycleAndLiveDataCompilerAndViewModelKTXVersion")
    //Unit Test
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
    //Retrofit request
    implementation("com.squareup.retrofit2:retrofit:$retrofitVersion")
    implementation("com.squareup.retrofit2:converter-gson:$retrofitVersion")
    //Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutineVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutineVersion")
    //Materials
    implementation("com.google.android.material:material:$materialDesignVersion")
    //Hilt
    implementation("com.google.dagger:hilt-android:$hiltVersion")
    ksp("com.google.dagger:hilt-compiler:$hiltVersion")
    ksp("androidx.hilt:hilt-compiler:$hiltCompilerVersion")
    //Compose
    implementation("androidx.compose.foundation:foundation:$composeFoundationVersion")
    implementation("androidx.compose.material:material:$composeMaterialVersion")
    implementation("androidx.compose.material3:material3:$composeMaterial3Version")
    implementation("androidx.compose.runtime:runtime:$composeVersion")
    implementation("androidx.compose.runtime:runtime-livedata:$composeVersion")
    implementation("androidx.compose.ui:ui:$composeVersion")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:$composeVersion")
    debugImplementation("androidx.compose.ui:ui-tooling:$composeVersion")
    implementation("androidx.compose.ui:ui-tooling-preview:$composeVersion")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:$lifeCycleAndLiveDataCompilerAndViewModelKTXVersion")
    implementation("androidx.activity:activity-compose:$activityVersion")
    implementation("androidx.navigation:navigation-compose:$composeNavigationVersion")
    implementation("androidx.hilt:hilt-navigation-compose:$composeHiltNavigationVersion")
}