package com.example.pertemuan13.ui

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.pertemuan13.MahasiswaApp
import com.example.pertemuan13.repository.RepositoryMhs
import com.example.pertemuan13.ui.home.viewmodel.HomeViewModel
import com.example.pertemuan13.ui.home.viewmodel.InsertViewModel

object PenyediaViewModel{
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(
                mahasiswaApp().container.repositoryMhs
            )
        }

        initializer{
            InsertViewModel(
                mahasiswaApp().container.repositoryMhs
            )
        }
    }
    fun CreationExtras.mahasiswaApp(): MahasiswaApp =
        (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MahasiswaApp)}

