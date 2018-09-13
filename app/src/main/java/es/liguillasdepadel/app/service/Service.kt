package es.liguillasdepadel.app.service

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Service {

    private val BASEURL = "http://www.liguillasdepadel.es/app/"

    fun getRetrofit(): Retrofit {

        val builder = OkHttpClient().newBuilder()
        val client = builder.build()

        return Retrofit.Builder()
                .baseUrl(BASEURL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }
}