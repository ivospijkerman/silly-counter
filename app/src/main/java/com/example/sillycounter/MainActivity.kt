package com.example.sillycounter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.sillycounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        val viewModel: MainActivityViewModel by viewModels()

        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        binding.incrementButton.setOnClickListener {
            viewModel.counter.value = (viewModel.counter.value ?: 0) + 1
        }
    }
}