package com.example.mynuntium

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mynuntium.databinding.FragmentBinding
import com.example.mynuntium.databinding.FragmentViewMainBinding
import com.example.mynuntium.model.PagerData


class ViewPagerMovieFragment : Fragment() {

    lateinit var binding:FragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment, container, false)
        binding= FragmentBinding.bind(view)

        val movie = arguments?.getSerializable("pager") as PagerData

        binding.iv.setImageResource(movie.img)




        return view
    }

}