import kotlinx.coroutines.*

fun cancelJob(job: Job?){
    job?.cancel()
}

suspend fun runJob(){
    coroutineScope {
        val job = launch { // launch a new coroutine and keep a reference to its Job
            for(i in 1..100){

                //1 --> checking is coroutine active before running big tasks
                //if(coroutineContext.isActive) {

                    println(i)

                    //2 --> implicitly all suspending functions will check for cancellation
                    delay(500)

                    if (i == 30) {
                        //cancelJob(coroutineContext[Job])
                    }
                //}
            }
        }
        //3
        //job.join()
        //job.cancelAndJoin()
        println("checking cancel and join")
    }
}

suspend fun main(){
    runJob()
}