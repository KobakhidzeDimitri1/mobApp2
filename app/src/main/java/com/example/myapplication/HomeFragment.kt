package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.waterdelivery.R

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var firstNameEditText: EditText
    private lateinit var lastNameEditText: EditText
    private lateinit var gpaEditText: EditText
    private lateinit var toProfileFragment: AppCompatButton
    private lateinit var toListFragment: AppCompatButton

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        firstNameEditText = view.findViewById<EditText?>(R.id.homeFirstNameEditText)
        lastNameEditText = view.findViewById(R.id.homeLastNameEditText)
        gpaEditText = view.findViewById(R.id.homeGpaEditText)
        toProfileFragment = view.findViewById(R.id.sendDataToProfileButton)
        toListFragment = view.findViewById(R.id.moveToListButton)

        val controller = Navigation.findNavController(view)
        toProfileFragment.setOnClickListener {
            val firstName = firstNameEditText.text.toString()
            val lastName = lastNameEditText.text.toString()
            val gpa= lastNameEditText.text.toString()

            val action = HomeFragmentDirections.actionHomeFragmentToProfileFragment(firstName,lastName,gpa)
            controller.navigate(action)
        }
        toProfileFragment.setOnLongClickListener{
            firstNameEditText.setText("")
            lastNameEditText.setText("")
            gpaEditText.setText("")

            return@setOnLongClickListener true
        }

        toListFragment.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToListFragment()
            controller.navigate(action)
        }




    }

}