package com.example.mycalci.presentation

import android.view.Display
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycalci.viewmodel.CalculatorviewModel


@Composable

fun DisplayScreen(

){

    val viewModel : CalculatorviewModel = androidx.lifecycle.viewmodel.compose.viewModel()
    val state = viewModel.state



        Column(
            modifier = Modifier.fillMaxWidth()
                .padding(8.dp),
            horizontalAlignment = Alignment.End,

        ) {

            Text(
                text = state.display,
                fontSize = 32.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 24.dp),
                textAlign = TextAlign.End

            )
            Spacer(modifier = Modifier.height(8.dp))
            Text("")
        }

    }

