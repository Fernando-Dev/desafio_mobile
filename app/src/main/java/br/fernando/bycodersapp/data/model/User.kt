package br.fernando.bycodersapp.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    var email: String?,
    var password: String?
) : Parcelable
