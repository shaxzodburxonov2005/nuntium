package com.example.mynuntium

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mynuntium.databinding.FragmentPagerDataInfoBinding


class PagerDataInfoFragment : Fragment() {
    lateinit var binding:FragmentPagerDataInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_pager_data_info, container, false)
        binding= FragmentPagerDataInfoBinding.bind(view)

        return view
    }

}