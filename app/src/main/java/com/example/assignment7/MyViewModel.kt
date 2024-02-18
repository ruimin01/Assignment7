package com.example.assignment7

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MyViewModel:ViewModel() {
    var heightInput: String by  mutableStateOf("")
    var weightInput: String by  mutableStateOf("")

    fun calculationBmi() : Float
    {
        val userHeight = heightInput.toFloatOrNull() ?: 0.0f
        val userWeight = weightInput.toIntOrNull() ?: 0
        return if (userWeight > 0 && userHeight > 0) {
            userWeight / (userHeight * userHeight)
        } else {
            0.0f
        }
    }
}