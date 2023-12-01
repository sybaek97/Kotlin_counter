package com.crepass.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val numberTextView= findViewById<TextView>(R.id.numberTextView)
        val resetButton=findViewById<Button>(R.id.idResetButton)
        val plusButton=findViewById<Button>(R.id.idPlusButton)
        val minusButton=findViewById<Button>(R.id.idMinusButton)


        var number=0


        resetButton.setOnClickListener {
            number=0
            numberTextView.text= number.toString()
            Log.d("onClick","리셋 버튼이 클릭 됐습니다")
        }//온클릭을 하면 알려주는 기능
        plusButton.setOnClickListener {

            when(number){
                10->number=10
                else->number+=1
            }
            numberTextView.text= number.toString()
            Log.d("onClick","플러스 버튼이 클릭 됐습니다 숫자는 $number")
        }
        minusButton.setOnClickListener {

            when(number){
                0->number=0
                else->number-=1
            }

            numberTextView.text= number.toString()
            Log.d("onClick","마이너스 버튼이 클릭 됐습니다. 숫자는 $number")
        }
    }
}