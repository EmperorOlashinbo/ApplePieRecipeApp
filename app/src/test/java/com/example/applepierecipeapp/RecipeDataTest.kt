package com.example.applepierecipeapp

import org.junit.Assert
import org.junit.Test

class RecipeDataTest {

    @Test
    fun testRecipeTitleNotEmpty() {
        Assert.assertFalse(recipeTitle.isEmpty())
    }

    @Test
    fun testRecipeContentContainsIngredients() {
        Assert.assertTrue(recipeContent.contains("Ingredients"))
    }

    @Test
    fun testRecipeContentContainsInstructions() {
        Assert.assertTrue(recipeContent.contains("Instructions"))
    }
}