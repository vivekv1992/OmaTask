package com.omaemirates

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.omaemirates.databinding.ListBinding

class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.merchCountry.text = ""
    }

    override fun getItemCount(): Int {
        return 0
    }

    class ViewHolder(val binding: ListBinding) : RecyclerView.ViewHolder(binding.root) {

    }

}