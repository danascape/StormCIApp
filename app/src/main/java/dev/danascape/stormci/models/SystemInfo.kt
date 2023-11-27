package dev.danascape.stormci.models

import com.google.gson.annotations.SerializedName

data class SystemInfo(
    @SerializedName("system_name")
    val system_name: String
)
