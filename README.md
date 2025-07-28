# My Recipe Book 📖🍲

A simple Android app built in **Kotlin** (using Android Studio) that allows users to add, view, and organize family recipes.  
The app uses arrays, loops, and screen navigation, and stores recipes with categories, ratings, and ingredients.

---

## 📌 Features
- Add new recipes with:
  - Title
  - Category (e.g., Dessert, Main Meal)
  - Rating (1–5 stars)
  - Ingredients
- View all stored recipes in a detailed screen
- Calculate and display the **average rating** across all recipes
- Simple navigation between screens
- Error handling with user-friendly feedback

---

## 🖼️ Screens

### Main Screen
- Button to **Add to Recipe Book**
- Button to **View Recipes**
- Button to **Exit the App**

### Add Recipe Screen
- Input fields for:
  - Recipe Title
  - Category
  - Rating
  - Ingredients
- Save button to add recipe to the collection

### Detailed View Screen
- Shows all recipes in a list format
- Calculates average rating
- Button to return to main screen

---

## 🛠️ Tech Stack
- **Language:** Kotlin
- **Framework:** Android SDK
- **IDE:** Android Studio
- **UI:** XML Layouts
- **Version Control:** Git & GitHub

---

## 📂 Project Structure

/app
/src/main/java/com/example/myrecipebook
├── MainActivity.kt
├── AddRecipeActivity.kt
├── DetailActivity.kt
├── RecipeData.kt
/res/layout
├── activity_main.xml
├── activity_add_recipes.xml
├── detail_activity.xml


## 🚀 Installation & Setup
1. Clone this repository:
   ```bash
   git clone:  https://github.com/Londiwe-803/MyRecipeBook/tree/master 
Open the project in Android Studio.

Sync Gradle and build the project.

Run the app on an emulator or a physical device.

🧪 Usage
Launch the app.

From the main screen:

Tap Add to Recipe Book to add a new recipe.

Tap View Recipes to see the full list of saved recipes.

Tap Exit to close the app.

On the detailed view screen:

Tap Show Recipes to display all stored recipes.

Tap Show Average Rating to calculate the average score.

Tap Back to return to the main screen.

📊 Example Data
Recipe Title	Category	Rating	Ingredients
Bluberry Cheesecake	Dessert	"Cream Cheese, Heavy Cream, Condensed Milk, Lemon Juice, Blueberry Syrup, Crushed Biscuits",
Beef lasagna	Main meal "Beef Mince, Onions, Tomato Paste, Seasonings, Mushroom Sauce, Lasagna Sheets"
Garlic Naan	Main meal	"Flour, Greek Yogurt, Crushed Garlic, Parsley, Salt, Sugar",
Ginger Cookies	Dessert	"Butter, Sugar, Ginger Powder, Eggs, Flour, vanilla extract"

📌 Evaluation Criteria
✅ Correct use of arrays and loops

✅ Screen navigation with buttons

✅ Error handling with user feedback

✅ Clear, commented, and well-structured code

✅ Accurate calculation of average rating

📧 Contact
Project developed for coursework.
Maintained by Londiwe Tembe at Varsity College ST10488648
IMAD5112
