package com.example.trickery_game

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.Button01).setOnClickListener(myButtonClick)
        findViewById<View>(R.id.Button02).setOnClickListener(myButtonClick)
        findViewById<View>(R.id.Button03).setOnClickListener(myButtonClick)
        findViewById<View>(R.id.Button04).setOnClickListener(myButtonClick)

    }

    var myButtonClick = View.OnClickListener { v ->
        var n = 0
        val s:String

        val r = Random().nextInt(4) + 1 // 1 ~ 4 사이의 난수

        when (v.id) {
            R.id.Button01 -> n = 1
            R.id.Button02 -> n = 2
            R.id.Button03 -> n = 3
            R.id.Button04 -> n = 4
        }

        if(n == r)
            s = "축하합니다. 당첨되었습니다."
        else
            s = "안타깝습니다.\n다음 기회에 다시 도전하세요"

        findViewById<TextView>(R.id.TextVeiw01).setText(s)

    }
}