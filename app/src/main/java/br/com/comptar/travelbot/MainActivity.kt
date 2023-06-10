package br.com.comptar.travelbot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btGoPerguntas = findViewById<Button>(R.id.buttonIniciar)
        btGoPerguntas.setOnClickListener {
            val intent = Intent(this@MainActivity,TelaPergunta1Activity::class.java)
            startActivity(intent)
        }
    }
}