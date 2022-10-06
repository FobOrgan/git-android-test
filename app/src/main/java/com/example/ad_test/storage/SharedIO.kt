package com.example.ad_test.storage

import android.content.Context
import android.content.SharedPreferences

class SharedIO (ctx: Context, storageFileName: String){
    private var data: SharedPreferences = ctx.getSharedPreferences(storageFileName,Context.MODE_PRIVATE)

    init {

    }

    fun writeIntValue(name: String,value: Int){
        data.edit().putInt(name,value).apply()
    }

    fun readIntValue(name: String):Int{
        return data.getInt(name,0)
    }
}