package com.example.teamworkstudentsgeeks15group.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.teamworkstudentsgeeks15group.R
import com.example.teamworkstudentsgeeks15group.data.model.StudentsModel
import com.example.teamworkstudentsgeeks15group.databinding.FragmentFirstBinding
import com.example.teamworkstudentsgeeks15group.ui.adapter.OnItemClick
import com.example.teamworkstudentsgeeks15group.ui.adapter.StudentAdapter

class FirstFragment : Fragment(R.layout.fragment_first), OnItemClick {
    private val binding by viewBinding(FragmentFirstBinding::bind)
    private val adapter = StudentAdapter(this)

    private val viewModel by viewModels<StudentsViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        subscribe()
        toAddFragmentButton()
    }

    private fun initialize() {
        binding.rvStudents.adapter = adapter
    }

    private fun subscribe() {
        viewModel.arancarLiveData.observe(viewLifecycleOwner) {
            adapter.setStudents(it)
            Log.e("tag", "subscribe:$it ")
        }
    }

    private fun toAddFragmentButton() = with(binding) {
        addButton.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_addFragment)
        }
    }

    override fun onClick(studentsModel: StudentsModel) {
        findNavController().navigate(
            FirstFragmentDirections.actionFirstFragmentToDetailFragment(
                studentsModel
            )
        )

    }

}