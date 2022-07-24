package com.example.foodapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.food_design_layout.view.*

class FoodAdapter: BaseAdapter {
    var listOfFood= ArrayList<Food>()
    var context:Context?=null
    constructor(context: Context, listOfFood:ArrayList<Food>):super() {
        this.context = context
        this.listOfFood=listOfFood
    }

    override fun getCount(): Int {
        return listOfFood.size
    }

    override fun getItem(p0: Int): Any {
        return listOfFood[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val food = this.listOfFood[p0]
        var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var foodView= inflator.inflate(R.layout.food_design_layout,null)
        foodView.imageView.setImageResource(food.img!!)
        foodView.textView.text =  food.name!!
        foodView.imageView.setOnClickListener {
            val intent = Intent(context,Food_Details_Activity::class.java)
            intent.putExtra("name",food.name!!)
            intent.putExtra("des",food.des!!)
            intent.putExtra("image",food.img!!)
            context!!.startActivity(intent)
        }
        return  foodView
    }
}