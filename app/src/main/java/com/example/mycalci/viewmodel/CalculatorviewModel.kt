package com.example.mycalci.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

import com.example.mycalci.model.CalculatorState

sealed interface CalculatorEvent

data class NumberEvent(
    val number : String
): CalculatorEvent

data class OperatorEvent(
    val operator : String
): CalculatorEvent

object DeleteEvent: CalculatorEvent

object ClearEvent : CalculatorEvent

object CalculateEvent: CalculatorEvent

class CalculatorviewModel : ViewModel(){
    var state by mutableStateOf(CalculatorState())

    private set

    fun onEvent(event: CalculatorEvent){

        when(event){
            is NumberEvent ->{

                if(state.display == "0"){

                    state = state.copy(
                        display = event.number
                    )

                } else {

                    state = state.copy(
                     display  = state.display + event.number

                    )

                }

            }

            is OperatorEvent ->{

                val lastChar = state.display.last()

                if(
                    lastChar =='+' || lastChar =='-' || lastChar == '*' || lastChar == '/'
                ){
                    state = state.copy(
                        display = state.display.dropLast(1) + event.operator
                    )

                }else{
                    state = state.copy(
                        display = state.display + event.operator
                    )
                }


            }

            is DeleteEvent ->{

              if(state.display.length == 1) {
                  state = state.copy(
                      display = "0"
                  )
              } else {

                  state = state.copy(
                      display = state.display.dropLast(1)
                  )
              }


            }

            is ClearEvent -> {

                state = state.copy(
                    display = "0"
                )

            }

            is CalculateEvent -> {

                val display = state.display

                val operator = when {
                    display.contains("+") -> "+"
                    display.contains("-") -> "-"
                    display.contains("*") -> "*"
                    display.contains("/") -> "/"
                    else -> return
                }

                val parts = display.split(operator)

                if(parts.size !=2) return

                val num1 =parts[0].toDoubleOrNull()?: return
                val num2 =parts[1].toDoubleOrNull()?: return

                val result = when (operator){
                    "+" -> num1 + num2
                        "-" -> num1 - num2
                    "*" -> num1 * num2
                    "/" -> {
                        if (num2 == 0.0) return
                        num1 / num2
                    }
                    else -> return
                }
              val resultText =
                  if (result %1 ==0.0){
                      result.toInt().toString()
                  }else{
                      result.toString()
                  }

                state = state.copy(
                    display = resultText
                )


            }
        }

    }
}