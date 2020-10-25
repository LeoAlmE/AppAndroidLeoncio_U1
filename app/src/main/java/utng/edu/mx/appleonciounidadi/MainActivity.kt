package utng.edu.mx.appleonciounidadi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.TranslateAnimation
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        var etUser = findViewById(R.id.etUser) as EditText
        var etPass = findViewById(R.id.etPass) as EditText
        var btnLogin = findViewById(R.id.btnLogin) as Button
        var tvInicio = findViewById(R.id.tvInicio) as TextView

        var an = TranslateAnimation(-1600.0f, 0.0f, 0.0f, 0.0f);
        an.setDuration(1000);

        tvInicio.startAnimation(an);
        btnLogin.setOnClickListener{

            val user: String = etUser.text.toString()
            val pass: String = etPass.text.toString()

            if(user == "lalmaguer" && pass == "admin"){
                Toast.makeText(this@MainActivity, "Ingresando", Toast.LENGTH_LONG).show()
                val intent = Intent(this,InicioUserActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this@MainActivity, "Usuario y/o contraseña incorrectos", Toast.LENGTH_LONG).show()
            }
        }

    }
}