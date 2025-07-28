package vcmsa.londiwe.exampple.myrecipebook

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAdd: Button = findViewById(R.id.btnAdd)
        val btnView: Button = findViewById(R.id.btnView)
        val btnExit: Button = findViewById(R.id.btnExit)

        btnAdd.setOnClickListener {
            startActivity(Intent(this, AddRecipes::class.java))
        }

        btnView.setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java))
        }

        btnExit.setOnClickListener {
            finishAffinity()
        }
    }
}