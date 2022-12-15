package com.example.multimedia_t4

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
            sumarYRestar(it)
        }
    }

    private fun sumarYRestar(view: View) {
        val editText = findViewById<EditText>(R.id.numPorUsuario)
        val editarNum = findViewById<TextView>(R.id.numPorDefecto)

        editarNum.text = "funciona"
        editText.visibility=View.GONE
        view.visibility=View.GONE

        editarNum.visibility=View.VISIBLE

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken,0)

    }

}

