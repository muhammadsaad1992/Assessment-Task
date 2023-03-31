package com.example.assessmenttask.adapter


import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.assessmenttask.R
import com.example.assessmenttask.model.CatFacts


class FactsAdapter(private val fact: List<CatFacts>) : RecyclerView.Adapter<FactsAdapter.ViewHolder>() {

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val facts: TextView = itemView.findViewById(R.id.factsDesc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemslayout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return fact.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val facts = fact[position]
        holder.facts.text = facts.text + " " + "\"length\"" + " " + ":" + facts.text.length
    }
}