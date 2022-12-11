package com.omaemirates

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class AppMain : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}