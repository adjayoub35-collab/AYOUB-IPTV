plugins { id("com.android.application") }

android {
    namespace = "com.ayoub.iptv"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.ayoub.iptv"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.1-phone-tv"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
