package dev.danascape.stormci.models

import com.google.gson.annotations.SerializedName

data class SystemInfo(
    @SerializedName("system_name")
    val system_name: String,
    val kernel_ver: String,
    val hostname: String,
    val core_count: String,
    val uptime: String,
    val cpu_load_avg: String,
    val mem_total: String,
    val mem_used: String
)
