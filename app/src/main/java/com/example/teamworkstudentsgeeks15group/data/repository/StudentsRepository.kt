package com.example.teamworkstudentsgeeks15group.data.repository

import com.example.teamworkstudentsgeeks15group.R
import com.example.teamworkstudentsgeeks15group.data.model.StudentsModel

class StudentsRepository {

    val studentsModel = mutableListOf<StudentsModel>()

    init {
        imageGeeks()
    }

    private fun imageGeeks() {
        studentsModel.add(StudentsModel(R.drawable.erbol, "Erbol", 18))
        studentsModel.add(StudentsModel(R.drawable.erzhan, "Erzhan", 10))
        studentsModel.add(StudentsModel(R.drawable.leila, "Leila", 18))
    }
}