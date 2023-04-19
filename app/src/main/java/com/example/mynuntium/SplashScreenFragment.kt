package com.example.mynuntium

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mynuntium.databinding.FragmentSplashScreenBinding


class SplashScreenFragment : Fragment() {
    lateinit var binding:FragmentSplashScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_splash_screen, container, false)
        binding= FragmentSplashScreenBinding.bind(view)

        Handler(Looper.myLooper()!!).postDelayed({
           findNavController().navigate(R.id.viewMainFragment)
        },5000)

        return view
    }


}