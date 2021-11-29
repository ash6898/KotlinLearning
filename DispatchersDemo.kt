package main.kotlin

import kotlinx.coroutines.*

suspend fun main()  {
    coroutineScope {

        launch { // context of the parent, main runBlocking coroutine
            println("main runBlocking      : I'm working in thread ${Thread.currentThread().name}")
            delay(1000)
            println("main runBlocking      : I'm working in thread ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Unconfined){
            println("Unconfined      : I'm working in thread ${Thread.currentThread().name}")
            delay(1000)
            println("Unconfined      : I'm working in thread ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Default){
            println("Default      : I'm working in thread ${Thread.currentThread().name}")
            delay(1000)
            println("Default      : I'm working in thread ${Thread.currentThread().name}")
            delay(1000)
        }

        launch(newSingleThreadContext("myOwnThread")){
            println("newSingleThreadContext      : I'm working in thread ${Thread.currentThread().name}")
            delay(1000)
            println("newSingleThreadContext      : I'm working in thread ${Thread.currentThread().name}")
        }

    }
}