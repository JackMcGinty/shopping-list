package com.bryan.shopping_list

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.shopping_list_item.view.*
// Heavily borrowed from https://medium.com/android-news/using-recyclerview-in-android-kotlin-722991e86bf3

class itemAdapter(val items : ArrayList<String>, val context : Context, val owner: MainActivity) : RecyclerView.Adapter<ViewHolder>() {
    // Get the number of items
    override fun getItemCount(): Int {
        return items.size
    }
    // inflates the item views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.shopping_list_item, parent, false))
    }
    // binds each item in the list to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.tvItemName?.text = "${items[position]}"
        // set up deleting
        holder?.buttonRemove?.setOnClickListener { removeItem(position) }

    }

    private fun removeItem(position: Int) {
        items.removeAt(position)
        owner.updateRecyclerView()
    }
}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    // Holds the TextView that we add each item to
    val tvItemName: TextView = view.tv_itemName
    // Also hangs onto our delete button
    val buttonRemove: ImageButton = view.buttonRemove
}