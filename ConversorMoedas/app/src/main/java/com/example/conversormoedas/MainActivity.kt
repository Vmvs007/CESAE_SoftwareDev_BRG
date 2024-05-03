package com.example.conversormoedas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.conversormoedas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener{
            var valorEuros:Double = binding.editTextEuros.text.toString().toDouble()
            var valorDolares: Double = String.format("%.2f",valorEuros*0.8).toDouble()



            binding.textDolaresConvertidos.text="$valorDolares \$"
        }



    }
}