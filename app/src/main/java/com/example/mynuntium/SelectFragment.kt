package com.example.mynuntium

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.mynuntium.adapte.Adapter
import com.example.mynuntium.databinding.FragmentSelectBinding
import com.example.mynuntium.model.Selected


class SelectFragment : Fragment() {
    lateinit var binding:FragmentSelectBinding
    lateinit var adapter: Adapter
    lateinit var list: ArrayList<String>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val  view= inflater.inflate(R.layout.fragment_select, container, false)
        binding= FragmentSelectBinding.bind(view)
        loadSelected()

        binding.nextBtn.setOnClickListener {
            val selectedItem = adapter.getSelectedItem()
            findNavController().navigate(R.id.action_selectFragment_to_pagerDataInfoFragment)

        }


        binding.rv.adapter=adapter

        return view
    }

    private fun loadSelected() {
        list= ArrayList()

        list.add("Sports")
        list.add("Politics")
        list.add("Life")
        list.add("Gaming")
        list.add("Animals")
        list.add("Nature")
        list.add("Food")
        list.add("Art")
        list.add("History")
        list.add("Fashion")

    }



}