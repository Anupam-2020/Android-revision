package com.anupam.lifecycleactivity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.anupam.lifecycleactivity.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        Log.i("Anupam","onCreate")

        var counter = 0

//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)

        binding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_main
        )

//        binding.textView.text = "Data is from DataBinding"
        binding.vm = "Data is from variable DataBinding"

        binding.button.setOnClickListener {
            counter += 1
            binding.textView.text = counter.toString()
        }


    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Anupam","onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Anupam","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Anupam","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Anupam","onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Anupam","onDestroy")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Anupam","onStop")
    }



}