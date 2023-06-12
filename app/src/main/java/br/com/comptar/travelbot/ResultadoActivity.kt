package br.com.comptar.travelbot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

     val textView4 = findViewById<TextView>(R.id.textView4)
//        val local = intent.getStringExtra("local")

        textView4.setText(local)



    }

//    private fun RecuperaResultado(){
//
//        val textView4 = findViewById<TextView>(R.id.textView4)
//        val local = intent.getStringExtra("local")
//
//            textView4.setText(local)
//
//    }


}