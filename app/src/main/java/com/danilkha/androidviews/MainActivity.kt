package com.danilkha.androidviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val text: TextView by lazy { findViewById(R.id.text) }
    val nameET: EditText by lazy { findViewById(R.id.name) }
    val tallET: EditText by lazy { findViewById(R.id.tall) }
    val weightET: EditText by lazy { findViewById(R.id.weight) }
    val ageET: EditText by lazy { findViewById(R.id.age) }
    val calc: Button by lazy { findViewById(R.id.calc) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calc.setOnClickListener {
            val tall = tallET.toInt()?.takeIf { it in 1..250 }
            val weight = weightET.toInt().takeIf { it in 1..250 }
            val age = ageET.toInt().takeIf { it in 1..150 }

            if(tall != null && weight != null && age != null && nameET.text.toString().isNotBlank()){
                val answer = calc(tall, weight, age)
                text.text = getString(R.string.answer, answer)
            }else{
                text.text = getString(R.string.error)
            }
        }
    }

    private fun calc(
        tall: Int,
        weight: Int,
        age: Int,
    ): Int {
        return (10 * weight + 6.25 * tall - 5 * age - 5).toInt()
    }

    private fun EditText.toInt(): Int? = text.toString().toIntOrNull()
}