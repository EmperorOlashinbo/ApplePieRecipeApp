package com.example.applepierecipeapp

import org.junit.Test
import org.junit.Assert.*

class RecipeDataTest {

    @Test
    fun testRecipeTitleNotEmpty() {
        assertFalse(recipeTitle.isEmpty())
    }

    @Test
    fun testRecipeContentContainsIngredients() {
        assertTrue(recipeContent.contains("Ingredients"))
    }
}