package dev.danascape.stormci

import dev.danascape.stormci.models.SystemInfo
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiInterface {
    @GET("/systeminfo")
    fun getSystemInfo(): Call<SystemInfo>

    companion object{
        fun create(serverURL: String): ApiInterface {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(serverURL)
                .build()
            return retrofit.create(ApiInterface::class.java)
        }
    }
}