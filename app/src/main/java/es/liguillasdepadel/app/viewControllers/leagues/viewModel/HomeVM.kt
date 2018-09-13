package es.liguillasdepadel.app.viewControllers.leagues.viewModel

import android.arch.lifecycle.ViewModel
import es.liguillasdepadel.app.di.HomeServiceRepository

class HomeVM(val service: HomeServiceRepository): ViewModel() {

    fun reloadData() {

    }


}