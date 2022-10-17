package com.example.mytest

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.mytest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    private val etName: EditText = findViewById(R.id.etName)
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnResult.setOnClickListener{
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("myName", binding.etName.text.toString())
            intent.putExtra("myScore1", binding.etScore1.text.toString().toInt())
            intent.putExtra("myScore2", binding.etScore2.text.toString().toInt())
            intent.putExtra("myScore3", binding.etScore3.text.toString().toInt())
            startActivity(intent)
        }
    }
}