package com.guko.alfaromeomodels

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val modelsName = ArrayList<String>()
        modelsName.add("159")
        modelsName.add("Brera")
        modelsName.add("Giulietta ")
        modelsName.add("Stelvio")
        modelsName.add("Giulia")
/*
        val bitmap159 = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.af_159)
        val bitmapBrera = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.af_brera)
        val bitmapGiulietta = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.af_giulietta)
        val bitmapStelvio = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.af_stelvio)
        val bitmapGiulia = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.af_giulia)

        val modelPhotos  = ArrayList<Bitmap>()
        modelPhotos.add(bitmap159)
        modelPhotos.add(bitmapBrera)
        modelPhotos.add(bitmapGiulietta)
        modelPhotos.add(bitmapStelvio)
        modelPhotos.add(bitmapGiulia)
*/
        //daha verimli
        val DrawableId159 = R.drawable.af_159
        val DrawableIdBrera = R.drawable.af_brera
        val DrawableIdGiulietta = R.drawable.af_giulietta
        val DrawableIdStelvio = R.drawable.af_stelvio
        val DrawableIdGiulia = R.drawable.af_giulia

        var modelCarDrawable = ArrayList<Int>()

        modelCarDrawable.add(DrawableId159)
        modelCarDrawable.add(DrawableIdBrera)
        modelCarDrawable.add(DrawableIdGiulietta)
        modelCarDrawable.add(DrawableIdStelvio)
        modelCarDrawable.add(DrawableIdGiulia)


        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapter = RecyclerAdapter(modelsName,modelCarDrawable)
        recyclerView.adapter = adapter
    }
}