package com.guko.alfaromeomodels

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_trailer.*

class TrailerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trailer)
        val intent = intent
        val chosenModelName = intent.getStringExtra("carName")
        val chosenModelPhoto = intent.getIntExtra("carPhotos",0)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources,chosenModelPhoto)
        iwCar.setImageBitmap(bitmap)
        textView.text = chosenModelName

        /*
        var chosenMode = SingletonClass.chosenModel
        val chosenCar = chosenMode.image
        iwCar.setImageBitmap(chosenCar)
        */
    }
}