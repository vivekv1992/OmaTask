package com.omaemirates

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.omaemirates.databinding.ListBinding
import com.omaemirates.model.CaKeyParam

class Adapter(private val dataList: List<CaKeyParam>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val caParam = dataList[position]
        holder.binding.exponent.text = caParam.exponent
        holder.binding.rid.text = caParam.rid
        holder.binding.expDate.text = caParam.expdate
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    class ViewHolder(val binding: ListBinding) : RecyclerView.ViewHolder(binding.root) {

    }

}