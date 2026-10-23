package com.example.mycalci.presentation

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable

fun ButtonFunction(
    text: String,
    onClick:() ->Unit,
    colors: ButtonColors = ButtonDefaults.buttonColors(),
    modifier: Modifier = Modifier
){



    Button(
        onClick = onClick,
        colors = colors,
        modifier = modifier
            .size(72.dp),
        shape = RoundedCornerShape(20.dp)
    ) {
        Text(text = text,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
    }
}