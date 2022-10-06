package com.example.ad_test

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.example.ad_test.calc.CalcEngine
import com.example.ad_test.databinding.ActivityMainBinding
import com.example.ad_test.storage.SharedIO
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    lateinit var bc:ActivityMainBinding
    lateinit var man:Employee
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bc = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bc.root)
        supportActionBar?.hide()

        man = Employee("Igor")
    }

    interface Info{
        val model: String
            get() = "Undefined"
        val number: String
    }

    abstract class Person (protected val increment:UByte = 1u ){
        public abstract val name: String
        abstract var age: UByte
        fun happyBirthday(){
           age = (age.plus(increment)).toUByte()
        }
    }

    class Employee(name: String): Person(10u) {
        override val name: String = ""
        override var age: UByte = 0u
    }

    fun onClickBtTest(view: View) {
        //Toast.makeText(applicationContext, "London is a capital of Great Britain! My name is Igor!", Toast.LENGTH_SHORT).show()
        man.happyBirthday()
        bc.tvTest.text = man.age.toString()+" git test"
    }
}