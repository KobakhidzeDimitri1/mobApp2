package com.example.waterdelivery.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.waterdelivery.R

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    lateinit var firstNameTextView: TextView
    lateinit var lastNameTextView: TextView
    lateinit var gpaTextView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val lastName = ProfileFragmentArgs.fromBundle(requireArguments()).lastName
        val firstName = ProfileFragmentArgs.fromBundle(requireArguments()).firstName
        val gpa = ProfileFragmentArgs.fromBundle(requireArguments()).gpa

        firstNameTextView = view.findViewById<TextView>(R.id.firstNameTextView)
        lastNameTextView = view.findViewById<TextView>(R.id.lastNameTextView)
        gpaTextView = view.findViewById<TextView>(R.id.gpaTextView)

        if (lastName != "" && firstName != "" && gpa != "") {
            firstNameTextView.text = firstName
            lastNameTextView.text = lastName
            gpaTextView.text = gpa
        }

    }
}