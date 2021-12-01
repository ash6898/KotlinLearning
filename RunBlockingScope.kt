// sample program in android studio to demonstrate coroutines
import kotlinx.coroutines.*

fun main() {
    runBlocking {
        launch {
            delay(3000)
            println("In runBlock")
        }
        delay(1000)
        println("after runBlock")
    }
    }
