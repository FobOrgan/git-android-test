package com.example.ad_test.calc

class CalcEngine {
    companion object SumMethods{
        fun summa(a:Int, b:Int):Int{
            return a+b
        }
    }

    fun sum(a: Int, b: Int):Int{
        return summa(a,b)
    }
}