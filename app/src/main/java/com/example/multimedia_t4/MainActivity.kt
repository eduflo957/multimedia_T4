package com.example.multimedia_t4

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethod
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.botonMas).setOnClickListener {
            metodoSumar(it)
        }
        findViewById<Button>(R.id.botonMenos).setOnClickListener {
            metodoRestar(it)
        }
    }

    @SuppressLint("SetTextI18n")
    private fun metodoSumar(view: View) {
        val numUsuario = findViewById<EditText>(R.id.numPorUsuario)
        var numPantalla = findViewById<TextView>(R.id.numPorDefecto)

        val nro1 = numUsuario.text.toString().toInt()
        val nro2 = numPantalla.text.toString().toInt()
        val suma = nro1 + nro2
        numPantalla.text = "$suma"
    }

    private fun metodoRestar(view: View) {
        val numUsuario = findViewById<EditText>(R.id.numPorUsuario)
        val numPantalla = findViewById<TextView>(R.id.numPorDefecto)

        val nro1 = numUsuario.text.toString().toInt()
        val nro2 = numPantalla.text.toString().toInt()
        val resta = nro2 - nro1
        if (resta < 0) {
            numPantalla.text = "0"
        } else {
            numPantalla.text = "$resta"
        }
    }

}



//TODO intento 1
/*
numPantalla.text = "funciona"
numUsuario.visibility=View.GONE
view.visibility=View.GONE

numPantalla.visibility=View.VISIBLE

val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
imm.hideSoftInputFromWindow(view.windowToken,0)
*/
