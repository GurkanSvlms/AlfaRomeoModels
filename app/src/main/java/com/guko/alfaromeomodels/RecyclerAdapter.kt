package com.guko.alfaromeomodels

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*



class RecyclerAdapter(val modelList: ArrayList<String>, val carPhotos: ArrayList<Int>)
    : RecyclerView.Adapter<RecyclerAdapter.AlfaRomeoVH>() {
    class AlfaRomeoVH(itemView : View) : RecyclerView.ViewHolder(itemView) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlfaRomeoVH {
        //Inflater, LayoutInflater, MenuInflater
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return AlfaRomeoVH(itemView)
    }

    override fun onBindViewHolder(holder: AlfaRomeoVH, position: Int) {
        holder.itemView.tvRecycleView.text = modelList[position]
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,TrailerActivity::class.java)
            intent.putExtra("carName", modelList[position])

            intent.putExtra("carPhotos", carPhotos[position])
            /*
            val singleton = SingletonClass.chosenModel
            singleton.image = carPhotos[position]
            */

            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return modelList.size
    }
}