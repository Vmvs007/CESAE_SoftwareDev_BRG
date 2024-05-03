package com.example.sayhello

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.sayhello.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonOla.setOnClickListener{

            var nome:String = binding.editPrimeiroNome.text.toString()
            var apelido:String = binding.editApelido.text.toString()

            if(nome.isEmpty()){
                Toast.makeText(applicationContext, "Nome não inserido", Toast.LENGTH_SHORT).show()
            }else if(apelido.isEmpty()){
                Toast.makeText(applicationContext, "Apelido não inserido", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext, "Olá ${nome} ${apelido}", Toast.LENGTH_SHORT).show()
            }




        }


    }
}