package vcmsa.londiwe.exampple.myrecipebook

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AddRecipes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_recipes)

        val txtTitle: TextView = findViewById(R.id.txtTitle)
        val txtCategory: TextView = findViewById(R.id.txtCategory)
        val txtRating: TextView = findViewById(R.id.txtRating)
        val txtIngredients: TextView = findViewById(R.id.txtIngredients)
        val btnSave: Button = findViewById(R.id.btnSave)

        btnSave.setOnClickListener {
            try {
                val title = txtTitle.text.toString()
                val category = txtCategory.text.toString()
                val rating = txtRating.text.toString().toInt()
                val ingredient = txtIngredients.text.toString()

                if (title.isNotEmpty() && category.isNotEmpty() && rating in 1..5 && ingredient.isNotEmpty()) {
                    RecipeBookData.recipeTitles.add(title)   // ✅ use RecipeData not RecipeBookData
                    RecipeBookData.categories.add(category)
                    RecipeBookData.ratings.add(rating)
                    RecipeBookData.ingredients.add(ingredient)

                    Toast.makeText(this, "Recipe Added Successfully!", Toast.LENGTH_SHORT).show()
                    finish()
                } else {
                    Toast.makeText(this, "Please fill all fields correctly.", Toast.LENGTH_LONG).show()
                }
            } catch (e: Exception) {
                Toast.makeText(this, "Error: ${e.message}", Toast.LENGTH_LONG).show()
            }
        }
    }
}
