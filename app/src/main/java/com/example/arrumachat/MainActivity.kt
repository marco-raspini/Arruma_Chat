package com.example.arrumachat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.arrumachat.R
import com.example.arrumachats.MyAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var myAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView) // Certifique-se de que o ID está correto
        recyclerView.layoutManager = LinearLayoutManager(this)

        val itemList = listOf("Item 1", "Item 2", "Item 3")
        myAdapter = MyAdapter(itemList)
        recyclerView.adapter = myAdapter
    }
}