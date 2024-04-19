package com.example.teamworkstudentsgeeks15group.ui.fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.teamworkstudentsgeeks15group.data.model.StudentsModel
import com.example.teamworkstudentsgeeks15group.data.repository.StudentsRepository

class StudentsViewModel : ViewModel() {
    private val studentsRepository = StudentsRepository()
    private val _studentLiveData = MutableLiveData<MutableList<StudentsModel>>()
    val arancarLiveData: LiveData<MutableList<StudentsModel>> = _studentLiveData

    init {
        getStudent()
    }

    private fun getStudent() {
        _studentLiveData.value = studentsRepository.studentsModel
    }
}