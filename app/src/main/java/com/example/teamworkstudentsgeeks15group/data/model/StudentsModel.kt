package com.example.teamworkstudentsgeeks15group.data.model

import androidx.annotation.DrawableRes

data class StudentsModel(
    @DrawableRes
    val photo: Int,
    val name: String,
    val age: Int
)
