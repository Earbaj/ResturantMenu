package com.example.foodapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_food_details.*

class Food_Details_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_details)
        //Get data as bundle
        val bundle=intent.extras
        //Set data to the view
        ivFoodImage.setImageResource(bundle!!.getInt("image"))
        tvName.text = bundle!!.getString("name")
        tvDetails.text = bundle!!.getString("des")
    }
}