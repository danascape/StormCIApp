package dev.danascape.stormci.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class IPAddress(
    val iPAddress: String = "",
    val portName: String = "",
    val secureConnection: Boolean
): Parcelable
