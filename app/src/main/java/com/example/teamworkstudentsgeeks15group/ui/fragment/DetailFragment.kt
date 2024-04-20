package com.example.teamworkstudentsgeeks15group.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.teamworkstudentsgeeks15group.R
import com.example.teamworkstudentsgeeks15group.databinding.FragmentDetailBinding


class DetailFragment : Fragment(R.layout.fragment_detail) {
    private val binding by viewBinding(FragmentDetailBinding::bind)
    private val navArgs by navArgs<DetailFragmentArgs>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        description()
    }

    private fun description() = with(binding){
        val args = navArgs
        val name = args.model.name
        val image = args.model.photo
        val age = args.model.age
        val description = args.model.description
        tvName.text = name
        tvAge.text = age.toString()
        tvDescription.text = description
        ivAvatar.setImageResource(image)
    }
}