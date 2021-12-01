import kotlinx.coroutines.*

suspend fun testJob(){
    coroutineScope {
        val job = launch { // launch a new coroutine and keep a reference to its Job
            delay(3000L)
            println("World!")
        }
        println("Hello")

        launch {
            println("hihii")
        }

        delay(300)

        // 1
        //job.join()

        println("Done")

        // 2
        //job.start()

        //3
        //if (job.start()) job.join() else job.start()

    }
}

suspend fun main(){
    testJob()
}