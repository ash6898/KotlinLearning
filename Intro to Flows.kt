package main.kotlin

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun sample() : Flow<Int> = flow {
    for(i in 1..10){
        delay(500)
        emit((1..10).random())
    }
}

fun main(){

    runBlocking {
        launch {
            for (i in 1..5){
            println("running separate")
            delay(1000)
            }
        }
        sample().collect{
            println(it)
        }
    }
}