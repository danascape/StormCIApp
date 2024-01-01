package dev.danascape.stormci.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    fun create(serverURL: String): Retrofit {
        val builder = Retrofit.Builder()
        builder.addConverterFactory(GsonConverterFactory.create())
        builder.baseUrl(serverURL)
        return builder.build()
    }
}