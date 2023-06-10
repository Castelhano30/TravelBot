package br.com.comptar.travelbot

import android.graphics.Color
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TelaPergunta1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pergunta1)

        val btnResp1: Button = findViewById(R.id.Resp1)
        btnResp1.setOnClickListener {
            btnResp1.setBackgroundColor(Color.rgb(224, 17, 95))
            btnResp1.setTextColor(Color.BLACK)
        }

        val btnResp2: Button = findViewById(R.id.buttonResp2)
        btnResp2.setOnClickListener {
            btnResp2.setBackgroundColor(Color.rgb(224, 17, 95))
            btnResp2.setTextColor(Color.BLACK)
        }

        val btnResp3: Button = findViewById(R.id.buttonResp3)
        btnResp3.setOnClickListener {
            btnResp3.setBackgroundColor(Color.rgb(224, 17, 95))
            btnResp3.setTextColor(Color.BLACK)
        }

        val btnResp4: Button = findViewById(R.id.buttonResp4)
        btnResp4.setOnClickListener {
            btnResp4.setBackgroundColor(Color.rgb(224, 17, 95))
            btnResp4.setTextColor(Color.BLACK)
        }
    }

}

