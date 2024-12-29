package com.example.p12service.ui.viewmodel

import com.example.p12service.model.Mahasiswa

sealed class HomeUiState{
    data class Success(val mahasiswa: List<Mahasiswa>) : HomeUiState()
    object Error : HomeUiState()
    object  Loading : HomeUiState()
}