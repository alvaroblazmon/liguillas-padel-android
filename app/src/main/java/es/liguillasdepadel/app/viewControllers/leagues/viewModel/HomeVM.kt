package es.liguillasdepadel.app.viewControllers.leagues.viewModel

import android.arch.lifecycle.ViewModel
import android.util.Log
import com.google.gson.*
import es.liguillasdepadel.app.di.HomeServiceRepository
import es.liguillasdepadel.app.model.League
import es.liguillasdepadel.app.service.HomeResponseFormat
import es.liguillasdepadel.app.viewModel.LeagueItemVM
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*


class HomeVM(private val service: HomeServiceRepository): ViewModel() {

    fun reloadData() {
        callService( service.getService().getInfo() )
    }

    private fun callService(call: Call<HomeResponseFormat>) {
        call.enqueue( object: Callback<HomeResponseFormat> {

            override fun onResponse(call: Call<HomeResponseFormat>?, response: Response<HomeResponseFormat>?) {
                if (response != null && response.isSuccessful) {
                    response.body()?.let { jsonResponse ->

                        jsonResponse["leagues"]?.let { leaguesJson ->
                            val leagues = Arrays.asList<League>(*Gson().fromJson(leaguesJson.toString(), Array<League>::class.java))
                            val leaguesItemVM = leagues.map { LeagueItemVM(it) }
                            Log.d("", leaguesItemVM.toString())
                        }
                    }
                } else {
                    //infoMLD.value = null
                }
            }

            override fun onFailure(call: Call<HomeResponseFormat>?, t: Throwable?) {
                //infoMLD.value = null
                Log.d("", t.toString())
            }
        })
    }


}