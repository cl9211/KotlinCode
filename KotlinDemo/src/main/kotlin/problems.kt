import com.google.gson.Gson
import java.io.File

/**
 * Created by CHULEI on 2019/8/30.
 */
fun main() {
//    testGenerics<String>()
    val person = Person("name", 11)
    Gson().toJson(person).let {
        File("person.json").writer()
    }

    val person1: Person = Gson().fromJson(File("person.json").readText())
}

inline fun <reified T> testGenerics() {
    println(T::class.simpleName)
}

inline fun <reified T> Gson.fromJson(json: String): T = fromJson(json, T::class.java)

data class Person(val name: String, val age: Int)

fun needAPerson(person: Person) {

}
