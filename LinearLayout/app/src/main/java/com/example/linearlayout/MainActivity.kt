package com.example.linearlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.linearlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonConverterReal.setOnClickListener{
            var euro:Double = binding.editValorEuros.text.toString().toDouble()
            var real :Double = euro*4.4

            binding.textResultado.text="$real R\$"

        }

        binding.buttonConverterDolar.setOnClickListener{
            var euro:Double = binding.editValorEuros.text.toString().toDouble()
            var dolar :Double = euro*0.8

            binding.textResultado.text="$dolar \$"

        }

        binding.buttonConverterPeso.setOnClickListener{
            var euro:Double = binding.editValorEuros.text.toString().toDouble()
            var peso :Double = euro*31.5

            binding.textResultado.text="$peso P\$"

        }

    }
}