package com.example.pertemuan13.model

data class Mahasiswa(
    val nim: String,
    val nama: String,
    val alamat: String,
    val jenisKelamin: String,
    val kelas: String,
    val angkatan: String,
    val judulp: String,
    val dosen: String
){
    constructor() : this("", "", "", "", "", "","","")
}
