package com.example.mycalci.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults

import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme

import androidx.compose.material3.Scaffold

import androidx.compose.runtime.Composable

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycalci.viewmodel.CalculateEvent
import com.example.mycalci.viewmodel.CalculatorviewModel
import com.example.mycalci.viewmodel.ClearEvent
import com.example.mycalci.viewmodel.DeleteEvent
import com.example.mycalci.viewmodel.NumberEvent
import com.example.mycalci.viewmodel.OperatorEvent


@Composable

fun HomeScreen(

) {

    val viewModel : CalculatorviewModel = androidx.lifecycle.viewmodel.compose.viewModel()






        Scaffold(

            topBar = {
                CalTopAppBar()
            }


        ) { paddingValues ->


            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .padding(16.dp),
                verticalArrangement = Arrangement.Bottom

            ) {



                DisplayScreen()


                Card(
                    modifier = Modifier.fillMaxWidth()
                ) {





                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {



                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ) {

                            ButtonFunction(
                                text = "C",
                                onClick = {
                                    viewModel.onEvent(
                                        ClearEvent
                                    )
                                }
                            )

                            ButtonFunction(
                                text = "×",
                                onClick = {
                                    viewModel.onEvent(DeleteEvent)
                                }
                            )

                            ButtonFunction(
                                text = "%",
                                onClick = {
                                    viewModel.onEvent(
                                        OperatorEvent("%")
                                    )
                                }
                            )

                            ButtonFunction(
                                text = "/",
                                onClick = {
                                    viewModel.onEvent(
                                        OperatorEvent("/")
                                    )
                                }
                            )









                        }

                        Spacer(modifier = Modifier.height(8.dp))

                        Row(  modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceEvenly) {

                            ButtonFunction(
                                text = "7",
                                onClick = {
                                    viewModel.onEvent(
                                        NumberEvent("7")
                                    )
                                }
                            )
                            ButtonFunction(
                                text = "8",
                                onClick = {
                                    viewModel.onEvent(
                                        NumberEvent("8")
                                    )
                                }
                            )
                            ButtonFunction(
                                text = "9",
                                onClick = {
                                    viewModel.onEvent(
                                        NumberEvent("9")
                                    )
                                }
                            )

                            ButtonFunction(
                                text = "*",
                                onClick = {
                                    viewModel.onEvent(
                                        OperatorEvent("*")
                                    )
                                }
                            )

                        }

                        Spacer(modifier = Modifier.height(8.dp))

                        Row(  modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceEvenly){

                            ButtonFunction(
                                text = "4",
                                onClick = {
                                    viewModel.onEvent(
                                        NumberEvent("4")
                                    )
                                }
                            )
                            ButtonFunction(
                                text = "5",
                                onClick = {
                                    viewModel.onEvent(
                                        NumberEvent("5")
                                    )
                                }
                            )
                            ButtonFunction(
                                text = "6",
                                onClick = {
                                    viewModel.onEvent(
                                        NumberEvent("6")
                                    )
                                }
                            )
                            ButtonFunction(
                                text = "-",
                                onClick = {
                                    viewModel.onEvent(
                                        OperatorEvent("-")
                                    )
                                }
                            )


                        }

                        Spacer(modifier = Modifier.height(8.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ){

                            ButtonFunction(
                                text = "1",
                                onClick = {
                                    viewModel.onEvent(
                                        NumberEvent("1")
                                    )
                                }
                            )

                            ButtonFunction(
                                text = "2",
                                onClick = {
                                    viewModel.onEvent(
                                        NumberEvent("2")
                                    )
                                }
                            )

                            ButtonFunction(
                                text = "3",
                                onClick = {
                                    viewModel.onEvent(
                                        NumberEvent("3")
                                    )
                                }
                            )

                            ButtonFunction(
                                text = "+",
                                onClick = {
                                    viewModel.onEvent(
                                        OperatorEvent("+")
                                    )
                                },

                            )

                        }

                        Spacer(modifier = Modifier.height(8.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ){

                            ButtonFunction(
                                text = "",
                                onClick = {


                                }
                            )

                            ButtonFunction(
                                text = "0",
                                onClick = {
                                    viewModel.onEvent(
                                        NumberEvent("0")
                                    )
                                }
                            )


                            ButtonFunction(
                                text = ".",
                                onClick = {
                                    viewModel.onEvent(
                                        OperatorEvent(".")
                                    )
                                }
                            )

                            ButtonFunction(
                                text = "=",
                                onClick = {
                                    viewModel.onEvent(
                                        CalculateEvent
                                    )

                                },
                                colors = ButtonDefaults.buttonColors(
                                    contentColor = MaterialTheme.colorScheme.primary,
                                    containerColor = MaterialTheme.colorScheme.onPrimary
                                )
                            )

                        }


                    }

                }


            }

        }

    }


@Preview(showBackground = true, showSystemUi = true)
@Composable

fun ShowUi(){

    HomeScreen()

}