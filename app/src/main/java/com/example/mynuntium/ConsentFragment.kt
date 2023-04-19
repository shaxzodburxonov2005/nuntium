package com.example.mynuntium

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mynuntium.databinding.FragmentConsentBinding


class ConsentFragment : Fragment() {

    lateinit var binding:FragmentConsentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_consent, container, false)
        binding= FragmentConsentBinding.bind(view)

        binding.getbtn.setOnClickListener {
            findNavController().navigate(R.id.selectFragment)
        }

        return view
    }

}