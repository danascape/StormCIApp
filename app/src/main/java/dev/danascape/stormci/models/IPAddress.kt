package dev.danascape.stormci.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class IPAddress(
    val IPAddress: String = ""
): Parcelable
