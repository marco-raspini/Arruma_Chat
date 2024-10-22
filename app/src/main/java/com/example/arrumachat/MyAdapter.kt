package com.example.arrumachats

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView
import com.example.arrumachat.R

class MyAdapter(private val itemList: List<String>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val editText: EditText = itemView.findViewById(R.id.inputText)
        val button: Button = itemView.findViewById(R.id.button)

        init {
            button.setOnClickListener {
                // Lógica de click pode ser adicionada aqui
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.editText.setText(itemList[position]) // Usando o item da lista
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}