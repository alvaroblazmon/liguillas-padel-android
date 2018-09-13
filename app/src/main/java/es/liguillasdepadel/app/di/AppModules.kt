package es.liguillasdepadel.app.di

import es.liguillasdepadel.app.viewControllers.leagues.viewModel.HomeVM
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val appModule = module {
    single<HomeServiceRepository> { HomeServiceRepositoryImpl() }
    viewModel { HomeVM(get()) }
}