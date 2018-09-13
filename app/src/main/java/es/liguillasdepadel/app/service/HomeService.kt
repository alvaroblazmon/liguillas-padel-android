package es.liguillasdepadel.app.service

import com.google.gson.internal.LinkedTreeMap
import retrofit2.Call
import retrofit2.http.*

typealias HomeResponseFormat = Array<LinkedTreeMap<Any, Any>>

interface HomeService {

    @Headers("Content-type: application/json")
    @POST("total.php")
    fun getInfo(): Call<HomeResponseFormat>

}