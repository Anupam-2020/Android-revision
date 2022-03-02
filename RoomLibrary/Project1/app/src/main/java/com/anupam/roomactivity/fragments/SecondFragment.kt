package com.anupam.roomactivity.fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.anupam.roomactivity.R
import com.anupam.roomactivity.database.User
import com.anupam.roomactivity.database.UserDatabase
import com.anupam.roomactivity.database.UserViewModel
import com.anupam.roomactivity.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    private lateinit var mUserViewModel: UserViewModel

    private lateinit var database: UserDatabase


    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        database = UserDatabase.getDatabase(requireContext())
        getData()

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mUserViewModel = ViewModelProvider(this).get(UserViewModel::class.java)




        binding.button.setOnClickListener {
            insertDataToDatabase()
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun insertDataToDatabase() {

        val firstName = binding.firstName.text.toString()
        val lastName = binding.LastName.text.toString()
        val age = binding.Age.text

        if(inputCheck(firstName, lastName, age)) {
            val user = User(0,firstName,lastName,Integer.parseInt(age.toString()))

            mUserViewModel.addUser(user)
            Toast.makeText(requireContext(),"Sucessfully Added to Database",Toast.LENGTH_SHORT).show()

            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
        else {
            Toast.makeText(requireContext(),"Please fill all fields",Toast.LENGTH_SHORT).show()
        }
    }

    private fun inputCheck(firstName: String, lastName: String, age: Editable): Boolean {
        return !(TextUtils.isEmpty(firstName) && TextUtils.isEmpty(lastName) && age.isEmpty())
    }

    private fun getData() {
        database.userDao().readAllData().observe(this, {
            Log.i("@Data", it.toString())
        })
    }

}