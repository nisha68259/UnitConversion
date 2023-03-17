package com.example.unitconversion

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.unitconversion.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.convert.setOnClickListener {
            convert()
        }
        val context: Context = applicationContext
        val text: CharSequence =
            "Welcome to Conversion Calculator"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(context, text, duration)
        binding.main.setOnClickListener {
            toast.show()
        }
    }
    private fun convert() {
        val input = binding.input.text.toString().toDoubleOrNull() ?: return
        val from = binding.spinner1.selectedItem.toString()
        val to = binding.spinner2.selectedItem.toString()
        val result = when {
            from == "Kilometer" && to == "Meter" -> input * 1000.0
            from == "Kilometer" && to == "Centimeter" -> input * 100000.0
            from == "Centimeter" && to == "Meter" -> input * 0.01
            from == "Centimeter" && to == "Kilometer" -> input * 0.00001
            from == "Meter" && to == "Kilometer" -> input * 0.001
            from == "Meter" && to == "Centimeter" -> input * 100.0
            from == "Gram" && to == "Kilogram" -> input * 0.001
            from == "Gram" && to == "Pound" -> input * 0.0022
            from == "Kilogram" && to == "Gram" -> input * 1000.0
            from == "Kilogram" && to == "Pound" -> input * 2.2
            from == "Pound" && to == "Gram" -> input * 453.592
            from == "Pound" && to == "Kilogram" -> input * 0.453592
            from == "Litre" && to == "Millilitre" -> input * 1000.0
            from == "Millilitre" && to == "Litre" -> input * 0.001
            from == "Kelvin" && to == "Celsius" -> input - 273.15
            from == "Celsius" && to == "Kelvin" -> input + 273.15
            else -> null
        }
        if (result != null) {
            binding.output.text = result.toString()
        } else {
            showToast()
        }
    }

    private fun showToast() {
        val context: Context = applicationContext
        val text: CharSequence =
            "Seems like your selected option don't have any conversion available."
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(context, text, duration)
        toast.show()
    }
}