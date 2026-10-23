package com.example.mycalci.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Dehaze
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon

import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycalci.R

@OptIn(ExperimentalMaterial3Api::class)

@Composable

fun CalTopAppBar(){

    Row(
        modifier = Modifier.fillMaxWidth()
            .padding(4.dp)
            .statusBarsPadding(),
        horizontalArrangement = Arrangement.Center
    ){



        Text(
            text = "CalCulator",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )




    }
}


