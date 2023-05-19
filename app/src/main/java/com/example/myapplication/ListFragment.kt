package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.waterdelivery.R


class ListFragment : Fragment(R.layout.fragment_list) {

    lateinit var toHomeImageView : ImageView
    lateinit var toProfileImageView : ImageView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        toHomeImageView = view.findViewById<ImageView>(R.id.toHomeImageView)
        toProfileImageView = view.findViewById<ImageView>(R.id.toProfileImageView)

        val controller = Navigation.findNavController(view)
        toHomeImageView.setOnClickListener {

            val action = ListFragmentDirections.actionListFragmentToHomeFragment()
            controller.navigate(action)
        }

        toProfileImageView.setOnClickListener {

            val action = ListFragmentDirections.actionListFragmentToProfileFragment()
            controller.navigate(action)
        }


    }

}