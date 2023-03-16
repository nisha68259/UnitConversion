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
            val context: Context=applicationContext
            val text:CharSequence = "Seems like your selected option don't have any conversion available."
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(context,text,duration)

            if (binding.spinner1.selectedItem=="Kilometer" && binding.spinner2.selectedItem=="Meter" ){
                binding.output.text= (binding.input.editableText.toString().toDouble()*1000.0).toString()
            }
            else if (binding.spinner1.selectedItem=="Kilometer" && binding.spinner2.selectedItem=="Centimeter" ){
                binding.output.text= (binding.input.editableText.toString().toDouble()*100000.0).toString()
            }
            else if (binding.spinner1.selectedItem=="Centimeter" && binding.spinner2.selectedItem=="Meter" ){
                binding.output.text= (binding.input.editableText.toString().toDouble()*0.01).toString()
            }
            else if (binding.spinner1.selectedItem=="Centimeter" && binding.spinner2.selectedItem=="Kilometer" ){
                binding.output.text= (binding.input.editableText.toString().toDouble()*0.00001).toString()
            }
            else if (binding.spinner1.selectedItem=="Meter" && binding.spinner2.selectedItem=="Kilometer" ){
                binding.output.text= (binding.input.editableText.toString().toDouble()*0.001).toString()
            }
            else if (binding.spinner1.selectedItem=="Meter" && binding.spinner2.selectedItem=="Centimeter" ){
                binding.output.text= (binding.input.editableText.toString().toDouble()*100.0).toString()
            }
            else if (binding.spinner1.selectedItem=="Gram" && binding.spinner2.selectedItem=="Kilogram" ){
                binding.output.text= (binding.input.editableText.toString().toDouble()*0.001).toString()
            }
            else if (binding.spinner1.selectedItem=="Gram" && binding.spinner2.selectedItem=="Pound" ){
                binding.output.text= (binding.input.editableText.toString().toDouble()*0.0022).toString()
            }
            else if (binding.spinner1.selectedItem=="Kilogram" && binding.spinner2.selectedItem=="Gram" ){
                binding.output.text= (binding.input.editableText.toString().toDouble()*1000.0).toString()
            }
            else if (binding.spinner1.selectedItem=="Kilogram" && binding.spinner2.selectedItem=="Pound" ){
                binding.output.text= (binding.input.editableText.toString().toDouble()*2.2).toString()
            }
            else if (binding.spinner1.selectedItem=="Pound" && binding.spinner2.selectedItem=="Gram" ){
                binding.output.text= (binding.input.editableText.toString().toDouble()*453.592).toString()
            }
            else if (binding.spinner1.selectedItem=="Pound" && binding.spinner2.selectedItem=="Kilogram" ){
                binding.output.text= (binding.input.editableText.toString().toDouble()*0.453592).toString()
            }
            else if (binding.spinner1.selectedItem=="Litre" && binding.spinner2.selectedItem=="Millilitre" ){
                binding.output.text= (binding.input.editableText.toString().toDouble()*1000.0).toString()
            }
            else if (binding.spinner1.selectedItem=="Millilitre" && binding.spinner2.selectedItem=="Litre" ){
                binding.output.text= (binding.input.editableText.toString().toDouble()*0.001).toString()
            }
            else if (binding.spinner1.selectedItem=="Kelvin" && binding.spinner2.selectedItem=="Celsius" ){
                binding.output.text= (binding.input.editableText.toString().toDouble()-273.15).toString()
            }
            else if (binding.spinner1.selectedItem=="Celsius" && binding.spinner2.selectedItem=="Kelvin" ){
                binding.output.text= (binding.input.editableText.toString().toDouble()+273.15).toString()
            }
            else{
                toast.show()
            }
        }
    }
}