package com.example.laboratorio5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import java.util.jar.Manifest

class DetailsActivity : AppCompatActivity() {


    private lateinit var ButtonLlamar: Button
    private lateinit var ButtonCamara: Button





    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        ButtonLlamar=findViewById(R.id.button_DetailsActivity_llamar)
        ButtonCamara=findViewById(R.id.buttonCamara_DetailsActivity_Camara)


        Click()



    }
    private fun Click(){
        ButtonLlamar.setOnClickListener {

        }
        ButtonCamara.setOnClickListener {
            ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA)
        }
    }
}