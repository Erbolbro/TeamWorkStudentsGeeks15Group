package com.example.teamworkstudentsgeeks15group.data.repository

import com.example.teamworkstudentsgeeks15group.R
import com.example.teamworkstudentsgeeks15group.data.model.StudentsModel

class StudentsRepository {

    val studentsModel = mutableListOf<StudentsModel>()

    init {
        imageGeeks()
    }

    private fun imageGeeks() {
        studentsModel.add(StudentsModel(R.drawable.erbol, "Erbol", "18 лет", ""))
        studentsModel.add(StudentsModel(R.drawable.erzhan, "Erzhan", "10 лет", ""))
        studentsModel.add(StudentsModel(R.drawable.leila, "Leila", "18 лет", ""))
        studentsModel.add(
            StudentsModel(
                R.drawable.kuttuubai,
                "Kuttuubai",
                "15 лет",
                "Меня зовут Куттуубай. Я андроид разработчик. Лучше всего я разбираюсь в xml"
            )
        )
        studentsModel.add(StudentsModel(R.drawable.ilyas, "Ilyas", "19 лет", ""))
    }
}