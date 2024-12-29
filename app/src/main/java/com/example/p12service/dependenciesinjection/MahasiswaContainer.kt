package com.example.p12service.dependenciesinjection

import com.example.p12service.repository.MahasiswaRepository


interface AppContainer {
    val kontakRepository: MahasiswaRepository
}

class MahasiswaContainer: AppContainer {


}