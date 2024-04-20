package com.example.teamworkstudentsgeeks15group.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.teamworkstudentsgeeks15group.R
import com.example.teamworkstudentsgeeks15group.data.model.StudentsModel
import com.example.teamworkstudentsgeeks15group.databinding.FragmentAddBinding

class AddFragment : Fragment(R.layout.fragment_add) {

    private val binding by viewBinding(FragmentAddBinding::bind)
    private val viewModel by activityViewModels<StudentsViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        goToFirstFragment()
    }

    private fun goToFirstFragment() = with(binding) {
        btnAdd.setOnClickListener {
            val description = etAdd.text.toString()
            val studentsModel =
                StudentsModel(listOf(R.drawable.geeks, R.drawable.geeks), "информация", "", description)
            viewModel.addData(studentsModel)
            findNavController().navigate(R.id.action_addFragment_to_firstFragment2)
        }
    }
}