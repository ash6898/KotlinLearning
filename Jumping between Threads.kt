package main.kotlin

import kotlinx.coroutines.*

fun main()  {
    newSingleThreadContext("Ctx1").use { ctx1 ->
        newSingleThreadContext("Ctx2").use { ctx2 ->
            runBlocking(ctx1) {
                println("Started in ctx1")
                withContext(ctx2) {
                    println("Working in ctx2")
                }
                println("Back to ctx1")
            }
        }
    }
}