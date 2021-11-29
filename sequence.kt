package main.kotlin

import kotlinx.coroutines.*

suspend fun simple(): Sequence<Int> = sequence{
    for(i in 1..10){
        yield(i)
    }
}

suspend fun main() {
    coroutineScope {
        launch {
            /*simple().forEach {
                delay(1000)
                println("i -> $it")
            }*/
        delay(2000)
            println("donee")
        }
        launch {
            simple().forEach {
                delay(500)
                println("i --> $it")
            }
        }
        //obj.start()
        delay(1000)
        println("done...")
    }
    println("complete")
}