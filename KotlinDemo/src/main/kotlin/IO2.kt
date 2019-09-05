import java.io.File

/**
 * Created by CHULEI on 2019/9/5.
 */
fun main() {
    File("build.gradle").readLines().forEach(::println)
}