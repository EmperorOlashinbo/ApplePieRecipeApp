package com.example.applepierecipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.applepierecipeapp.ui.theme.ApplePieRecipeAppTheme
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ApplePieRecipeAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    RecipeScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

// RecipeScreen composable recipe data
private val recipeTitle = "Classic Apple Pie Recipe"
private val recipeContent = """
    **Ingredients:**
    - 6 cups thinly sliced apples (e.g., Granny Smith)
    - 3/4 cup white sugar
    - 2 tablespoons all-purpose flour
    - 1 teaspoon cinnamon
    - 1/4 teaspoon salt
    - 1 tablespoon lemon juice
    - 1 package pastry for double-crust pie

    **Instructions:**
    1. Preheat oven to 425°F (220°C).
    2. Mix apples, sugar, flour, cinnamon, salt, and lemon juice.
    3. Place bottom crust in pie dish, add filling, and cover with top crust.
    4. Bake for 40-50 minutes until golden brown.
""".trimIndent()

@Composable
fun RecipeScreen(modifier: Modifier = Modifier) {
    var isVisible by remember { mutableStateOf(true) } // State for toggle

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFF5E8C7))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    }
