package com.example.teamworkstudentsgeeks15group.data.model

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize
@Parcelize
data class StudentsModel(
    @DrawableRes
    val photo: Int,
    val name: String,
    val age: Int,
    val description:String,
):Parcelable
