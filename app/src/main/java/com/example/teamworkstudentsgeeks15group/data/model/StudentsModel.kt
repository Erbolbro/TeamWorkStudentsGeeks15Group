package com.example.teamworkstudentsgeeks15group.data.model

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize

@Parcelize
data class StudentsModel(
    @DrawableRes
    val photo: List<Int>,
    val name: String,
    val age: String,
    val description: String,
) : Parcelable