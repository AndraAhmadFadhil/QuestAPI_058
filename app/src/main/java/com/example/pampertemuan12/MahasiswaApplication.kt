package com.example.pampertemuan12

import android.app.Application
import com.example.pampertemuan12.dependenciesinjection.AppContainer
import com.example.pampertemuan12.dependenciesinjection.MahasiswaContainer

class MahasiswaApplication: Application() {

    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}