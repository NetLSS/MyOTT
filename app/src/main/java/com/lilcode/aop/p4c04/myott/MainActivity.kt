package com.lilcode.aop.p4c04.myott

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lilcode.aop.p4c04.myott.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = requireNotNull(_binding)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}