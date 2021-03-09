import com.google.gson.Gson
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.util.concurrent.Executor
import java.util.concurrent.Executors

fun testThread (number: String ) {
    for (i in 1..10) {
        println("this is $i of $number")
        Thread.sleep(2000)
    }
}

fun main() {
    val audioRecordExecutor: Executor = Executors.newFixedThreadPool(2)
    audioRecordExecutor.execute(Runnable {
        testThread("h1")
    })
    audioRecordExecutor.execute(Runnable {
        testThread("h2")
    })
    audioRecordExecutor.execute(Runnable {
        testThread("h3")
    })
}