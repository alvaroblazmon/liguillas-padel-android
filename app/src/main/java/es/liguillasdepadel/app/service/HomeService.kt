package es.liguillasdepadel.app.service

import com.google.gson.JsonArray
import com.google.gson.internal.LinkedTreeMap
import retrofit2.Call
import retrofit2.http.*

typealias HomeResponseFormat = LinkedTreeMap<Any, JsonArray>

interface HomeService {

    @Headers("Content-type: application/json")
    @POST("total.php")
    fun getInfo(): Call<HomeResponseFormat>

}