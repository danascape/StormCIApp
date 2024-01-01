package dev.danascape.stormci.api.services

import dev.danascape.stormci.api.ApiEndPoints
import dev.danascape.stormci.models.SystemInfo
import retrofit2.Call
import retrofit2.http.GET

interface SystemInformation {
    @GET(ApiEndPoints.systemInfo)
    fun getSystemInformation(): Call<SystemInfo>
}