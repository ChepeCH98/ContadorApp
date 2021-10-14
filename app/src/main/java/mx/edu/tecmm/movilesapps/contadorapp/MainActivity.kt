package mx.edu.tecmm.movilesapps.contadorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Codigo
        var contadorInt=0!!.toInt()

        val txtContador:TextView=findViewById(R.id.txtContador)
        txtContador.text="0"
        val boton:Button=findViewById(R.id.btnAumentar)
        boton.setOnClickListener{
            //Funcion Boton Aumentar
            Log.e("MiApp","Se presiono el boton")

                contadorInt=contadorInt+1
                txtContador.text="${contadorInt.toString()}"

        }
        val botonR:Button=findViewById(R.id.btnReducir)
        //Funcion boton reducir
        botonR.setOnClickListener{

                contadorInt=contadorInt-1
                txtContador.text="${contadorInt.toString()}"

        }
    }
}