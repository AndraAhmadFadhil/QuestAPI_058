package com.example.pampertemuan12.dependenciesinjection

import com.example.pampertemuan12.repository.MahasiswaRepository
import com.example.pampertemuan12.repository.NetworkMahasiswaRepository
import com.example.pampertemuan12.service.MahasiswaService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

interface AppContainer{
    val mahasiswaRepository: MahasiswaRepository
}

class MahasiswaContainer: AppContainer{

    private val baseUrl ="http://10.0.2.2:8000/umyTI" //bisa diganti localhost (ganti ip jika run hp)
    private val json = Json { ignoreUnknownKeys = true }
    private val retrofit: Retrofit = Retrofit.Builder()
        .addConverterFactory(json.asConverterFactory("application/json".toMediaType()))
        .baseUrl(baseUrl).build()

    private val mahasiswaService: MahasiswaService by lazy {
        retrofit.create(MahasiswaService::class.java)
    }

    override val mahasiswaRepository: MahasiswaRepository by lazy {
        NetworkMahasiswaRepository(mahasiswaService)
    }

}