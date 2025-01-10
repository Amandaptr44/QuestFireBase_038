package com.example.pertemuan13.ui.home.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.pertemuan13.repository.RepositoryMhs

class InsertViewModel(
    private val mhs: RepositoryMhs
) : ViewModel() {
    var uiEvent: InsertUiState by mutableStateOf(InsertUiState())
        private set

    var uiState: FormState by mutableStateOf(FormState.Idle)
        private set

    //Memperbarui state berdasarkan input pengguna
    fun updateState(mahasiswaEvent) {
        uiEvent = uiEvent.copy(
            insertUiEvent = mahasiswaEvent,
        )
    }
}
