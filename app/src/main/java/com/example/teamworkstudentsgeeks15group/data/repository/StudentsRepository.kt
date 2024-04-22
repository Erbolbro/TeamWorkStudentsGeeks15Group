package com.example.teamworkstudentsgeeks15group.data.repository

import com.example.teamworkstudentsgeeks15group.R
import com.example.teamworkstudentsgeeks15group.data.model.StudentsModel

class StudentsRepository {

    val studentsModel = mutableListOf<StudentsModel>()

    init {
        imageGeeks()
    }

    private fun imageGeeks() {
        studentsModel.add(
            StudentsModel(
                listOf(R.drawable.erbol, R.drawable.erbol_devoloper),
                "Erbol",
                "18 лет",
                "Меня зовут Эрбол я будущий Андройд Разроботчик, мне нравится  бесить людей,  а так же  я очень упертый человек, но на самом деле " +
                        "я бетмен, когда все спят я спасаю город, потому  я нужен городу но никто об этом не знает😏,"
            )
        )
        studentsModel.add(
            StudentsModel(
                listOf(R.drawable.erzhan, R.drawable.erzhan_devoloper),
                "Erzhan",
                "10 лет",
                "мен дикий Эржан дарабос, черный тигр черный пантера аааааа"
            )
        )
        studentsModel.add(
            StudentsModel(
                listOf(R.drawable.leila, R.drawable.leila_devoloper),
                "Leila",
                "18 лет",
                "Меня зовут Лейла, мне мало что нравится, если спросите про мечту, врядли оно называется мечта но у меня есть цель, возрадить свой клан и убить определенного человека"
            )
        )
        studentsModel.add(
            StudentsModel(
                listOf(
                    R.drawable.kuttuubai, R.drawable.kuttubai_defeloper
                ), "Kuttuubai", "15 лет",
                "Меня зовут Куттуубай. Я андроид разработчик. Лучше всего я разбираюсь в xml"
            )
        )
        studentsModel.add(
            StudentsModel(
                listOf(R.drawable.ilyas, R.drawable.ilyas_devoloper),
                "Ilyas",
                "19 лет",
                "ильяс атоквейшиен атоквейшен, мне нравится аниме девушки"
            )
        )
    }

    fun addData(studentsModels: StudentsModel) {
        studentsModel.add(studentsModels)
    }
}