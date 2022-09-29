package com.example.laboratorio5

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    private lateinit var bottomNav: Button
    private lateinit var bottonMaps: ImageButton
    private lateinit var bottomDetails: Button
    private lateinit var bottomDescarga: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNav=findViewById(R.id.button_MainActivity_Iniciar)
        bottonMaps=findViewById(R.id.imageButtonMainActivity_Directions)
        bottomDetails=findViewById(R.id.button_MainActivity_Detalles)
        bottomDescarga=findViewById(R.id.button_MainActivity_Descargar)


        setToast()

        
    }

    private fun setToast(){

        bottonMaps.setOnClickListener{
            val location="http://maps.google.com/maps?gloc:14.602966698527062, -90.52140066136249"
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse(location))
            startActivity(intent)
        }



        bottomNav.setOnClickListener {
            Toast.makeText(applicationContext, "Walter Alexander Cruz Coronado", Toast.LENGTH_SHORT).show()
        }

        bottomDetails.setOnClickListener {
            startActivity(Intent(this,DetailsActivity::class.java))
        }

        bottomDescarga.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.whatsapp")))
        }


    }
}