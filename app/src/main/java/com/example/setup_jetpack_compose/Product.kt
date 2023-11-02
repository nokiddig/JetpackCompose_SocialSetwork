package com.example.setup_jetpack_compose

class Product(var name:String, var price:Double, var description:String) {

    override fun toString(): String {
        return "Product(name='$name', price=$price, description='$description')"
    }
}