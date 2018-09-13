package es.liguillasdepadel.app.di

import es.liguillasdepadel.app.service.HomeService
import es.liguillasdepadel.app.service.Service

interface HomeServiceRepository {
    fun getService3(): HomeService
}

class HomeServiceRepositoryImpl: HomeServiceRepository {
    override fun getService3(): HomeService = Service().getRetrofit().create(HomeService::class.java)
}