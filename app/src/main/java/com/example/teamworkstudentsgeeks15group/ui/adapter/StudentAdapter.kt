package com.example.teamworkstudentsgeeks15group.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.teamworkstudentsgeeks15group.data.model.StudentsModel
import com.example.teamworkstudentsgeeks15group.databinding.ItemStudentsBinding

class StudentAdapter(val onClick: OnItemClick) :
    RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {

    var _studentList = mutableListOf<StudentsModel>()

    fun setStudents(studentList: MutableList<StudentsModel>) {
        _studentList = studentList
        notifyDataSetChanged()
    }

    inner class StudentViewHolder(private val binding: ItemStudentsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.root.setOnClickListener {
                onClick.onClick(_studentList[adapterPosition])
            }
        }

        fun bind(model: StudentsModel) {
            binding.etName.text = model.name
            binding.etAge.text = model.age.toString()
            binding.ivPhoto.setImageResource(model.photo)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val binding =
            ItemStudentsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return StudentViewHolder(binding)
    }

    override fun getItemCount() = _studentList.size

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        holder.bind(_studentList[position])
    }
}