package com.example.mytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mytest.databinding.ActivityMainBinding
import com.example.mytest.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val myName = intent.getStringExtra("myname", )
        val myScore1 = intent.getIntExtra("myScore1", 0)
        val myScore2 = intent.getIntExtra("myScore2", 0)
        val myScore3 = intent.getIntExtra("myScore3", 0)

        val myTotal = myScore1 + myScore2 + myScore3
        val myAvg: Float = myTotal / 3.0f
        var isPassed : Boolean = false
        if(myAvg >= 60) {
            isPassed = true
            if(myScore1 < 40 || myScore2 < 40 || myScore3 <40) {
                isPassed = false
            }
        }

        if(isPassed) {
            binding.btnResult.text = """
                축하합니다!
                평균 ${myAvg} 점으로 합격했습니다.
            """.trimIndent()
        } else {
            binding.btnResult.text = """
                아쉽네요...
                평균 ${myAvg}로 불합격하셨어요...
            """.trimIndent()
        }
    }
}