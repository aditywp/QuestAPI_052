package com.example.p12service

import android.app.Application
import com.example.p12service.dependenciesinjection.AppContainer
import com.example.p12service.dependenciesinjection.MahasiswaContainer

class MahasiswaApplications:Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}