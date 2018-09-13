package es.liguillasdepadel.app

import android.app.Application
import es.liguillasdepadel.app.di.appModule
import org.koin.android.ext.android.startKoin

class LiguillasApp: Application() {


    override fun onCreate() {
        super.onCreate()

        startKoin(this, listOf(appModule))
    }

}