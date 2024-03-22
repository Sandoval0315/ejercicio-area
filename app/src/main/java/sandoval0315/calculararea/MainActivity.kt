package sandoval0315.calculararea

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    val Txtbase = findViewById<TextView>(R.id.txtbase)
    val Txtalturaa = findViewById<TextView>(R.id.txtalturaa)
    val Txtresultado = findViewById<TextView>(R.id.txtresultado)
    val BtnCalcular = findViewById<Button>(R.id.btncalcular)

        val objCalcular = Calcular()
        BtnCalcular.setOnClickListener {
val resultado = objCalcular.dividir(Txtbase.text.toString().toInt(), Txtalturaa.text.toString().toInt())
println("El area del triangulo es de $resultado")
Txtresultado.text = "El resultado del area es $resultado"
        }
    }
}