package com.bryan.shopping_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var itemInput : EditText
    var itemList : ArrayList<String> = ArrayList()
    private lateinit var linearLayoutManager: LinearLayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        linearLayoutManager = LinearLayoutManager(this)
        val itemRecycler = findViewById<RecyclerView>(R.id.itemRecycler)
        val addToListButton = findViewById<Button>(R.id.addToListButton)

        itemInput = findViewById(R.id.itemInput)

        itemList.add("eggs")
        itemList.add("milk")
        itemList.add("cereal")

        itemRecycler.layoutManager = linearLayoutManager
        itemRecycler.adapter = itemAdapter(itemList, this, this)
        addToListButton.setOnClickListener { addItemToList() }
        resetButton.setOnClickListener { resetList() }
    }

    private fun addItemToList() {
        val newItem = itemInput.text.toString()
        if (newItem != "") {
            itemList.add(newItem)
        }
        updateRecyclerView()
    }

    // It does exactly what it sounds like
    private fun resetList() {
        itemList.clear()
        updateRecyclerView()
        itemInput.text.clear()
    }

    // update our recycler view to reflect any changes in the list
    fun updateRecyclerView() {
        itemRecycler.adapter = itemAdapter(itemList, this, this)
    }
}
