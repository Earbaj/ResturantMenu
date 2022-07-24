package com.example.foodapp


// Simple food class to store data
class Food {
    var name:String? = null
    var des:String? = null
    var img:Int? = null
    constructor(name:String, des:String, img:Int){
        this.name = name
        this.des = des
        this.img = img
    }
}