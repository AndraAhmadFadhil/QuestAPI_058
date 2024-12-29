package com.example.pampertemuan12.ui.viewmodel

import com.example.pampertemuan12.data.Mahasiswa

sealed class HomeUiState{
    data class Succes(val mahasiswa: List<Mahasiswa>): HomeUiState()
    object Error: HomeUiState()
    object Loading: HomeUiState()
}