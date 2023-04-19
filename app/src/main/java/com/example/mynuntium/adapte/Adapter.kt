package com.example.mynuntium.adapte

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mynuntium.R
import com.example.mynuntium.databinding.ItemSelectedBinding
import com.example.mynuntium.model.Selected

class Adapter(
    var list: ArrayList<String>
) : RecyclerView.Adapter<Adapter.Vh>() {

    private var selectedItemList = ArrayList<String>()

    fun getSelectedItem(): ArrayList<String> {
        return selectedItemList
    }

    inner class Vh(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        fun onBind(selected: String) {
            val bind = ItemSelectedBinding.bind(itemView)
            bind.titleItem.text = selected

            bind.root.setOnClickListener {
                if (selectedItemList.contains(selected)) {
                    selectedItemList.remove(selected)
                    bind.itemImg.setImageResource(R.color.white)

                } else {
                    selectedItemList.add(selected)
                    bind.itemImg.setImageResource(R.color.purple_500)
                }

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_selected, parent, false)
        return Vh(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    interface Onclick {
        fun click(selected: String)
    }


}