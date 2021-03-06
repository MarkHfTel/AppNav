package de.hftl.mark.projmobapp

import android.content.Context
import android.content.Intent
import android.hardware.Sensor
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class SenAdapter(private val senList: ArrayList<String>) : RecyclerView.Adapter<SenAdapter.MyViewHolder>() {
    //val mContext:Context
    class MyViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val textView: TextView

        //val intent : Intent = Intent(MainActivity, DetailActivity::class.java)
        init {
            v.setOnClickListener { Log.d("YYYY:", "Ein Element wurde geklickt! $adapterPosition") }

            textView = v.findViewById(R.id.text_item)
        }

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = senList[position]
    }

    override fun getItemCount() = senList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SenAdapter.MyViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        return MyViewHolder(layout)
    }
}