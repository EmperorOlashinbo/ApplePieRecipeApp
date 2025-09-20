package com.example.applepierecipeapp

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertTextContains
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import com.example.applepierecipeapp.ui.theme.ApplePieRecipeAppTheme
import org.junit.Rule
import org.junit.Test

class RecipeScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testToggleButtonShowsAndHidesText() {
        composeTestRule.setContent {
            ApplePieRecipeAppTheme {
                RecipeScreen()
            }
        }

        // Initial state: Text should be visible
        composeTestRule.onNodeWithTag("recipeText")
            .assertIsDisplayed()
            .assertTextContains("Ingredients")

        // Click to hide
        composeTestRule.onNodeWithTag("toggleButton")
            .performClick()
        composeTestRule.onNodeWithTag("recipeText")
            .assertDoesNotExist()

        // Click to show again
        composeTestRule.onNodeWithTag("toggleButton")
            .performClick()
        composeTestRule.onNodeWithTag("recipeText")
            .assertIsDisplayed()
            .assertTextContains("Instructions")
    }

    @Test
    fun testInitialState() {
        composeTestRule.setContent {
            ApplePieRecipeAppTheme {
                RecipeScreen()
            }
        }
        composeTestRule.onNodeWithTag("recipeText")
            .assertIsDisplayed()
    }
    @Test
    fun testButtonExists() {
        composeTestRule.setContent {
            ApplePieRecipeAppTheme {
                RecipeScreen()
            }
        }
        composeTestRule.onNodeWithTag("toggleButton")
            .assertIsDisplayed()
    }
}