import kotlinx.coroutines.*

suspend fun main(){

    withTimeoutOrNull(2000){
        runJob()
    }

}