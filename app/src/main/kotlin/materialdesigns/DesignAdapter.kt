package com.jpberntsson.materialdesigns

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView


class DesignAdapter(private val context:Context) : RecyclerView.Adapter<DesignAdapter.ActivityViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActivityViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_activity, parent, false)
        val tvActivityName = view.findViewById<TextView>(R.id.tvActivityName)
        return ActivityViewHolder(view, tvActivityName)

    }

    override fun getItemCount(): Int {
        return 1
    }

    override fun onBindViewHolder(holder: ActivityViewHolder, position: Int) {
        holder.tvActivityName.setText("Collapsible toolbar with fixed title")
        holder.view.setOnClickListener {
        }
    }

    class ActivityViewHolder(val view:View, val tvActivityName:TextView): RecyclerView.ViewHolder(view)


}