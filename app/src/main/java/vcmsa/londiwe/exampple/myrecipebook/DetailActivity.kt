package vcmsa.londiwe.exampple.myrecipebook

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activty)

        val btnShow: Button = findViewById(R.id.btnshow)
        val btnAverage: Button = findViewById(R.id.btnAverage)
        val btnBack: Button = findViewById(R.id.btnBack)
        val txtOutput: TextView = findViewById(R.id.txtOutput)


        btnShow.setOnClickListener {
            val builder = StringBuilder()
            for (i in RecipeBookData.recipeTitles.indices) {
                builder.append("Recipe: ${RecipeBookData.recipeTitles[i]}\n")
                builder.append("Category: ${RecipeBookData.categories[i]}\n")
                builder.append("Rating: ${RecipeBookData.ratings[i]}\n")
                builder.append("Ingredients: ${RecipeBookData.ingredients[i]}\n\n")
            }
            txtOutput.text = builder.toString()
        }

        btnAverage.setOnClickListener {
            val avg = RecipeBookData.ratings.sum().toDouble() / RecipeBookData.ratings.size
            txtOutput.text = "Average Rating: %.2f".format(avg)
        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}