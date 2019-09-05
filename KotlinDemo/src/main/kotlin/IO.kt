import java.io.BufferedReader
import java.io.File
import java.io.FileReader

/**
 * Created by CHULEI on 2019/9/5.
 */
fun main() {
    val file = File("build.gradle")
    BufferedReader(FileReader(file)).use {
        var line: String
        while (true) {
            line = it.readLine() ?: break
            println(line)
        }
    }
}