package br.fernando.bycodersapp.ui.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.fernando.bycodersapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}