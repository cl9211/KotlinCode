/**
 * Created by CHULEI on 2019/8/28.
 */
fun main(args: Array<String>) {
    /* args.forEach(::println)

     val helloWorld = Hello::world

     val pdfPrinter = PDFPrinter()
     args.forEach(pdfPrinter::println)

    val list = listOf(1, 2, 3, 4, 5, 6, 7)


    val newList = ArrayList<Int>()
    list.forEach {
        val newElement = it * 2 + 3
        newList.add(newElement)
    }

    val newList = list.map {
        it * 2 + 3
    }

    val newList2 = list.map {
        it.toDouble()
    }

    val newList3 = list.map(Int::toDouble)

    newList2.forEach(::println)

    val list = listOf(
            1..20,
            2..5,
            100..322
    )

    val flatList = list.flatMap {
        it
    }

    println(flatList.reduce { acc, i -> acc + i })

    flatList.forEach(::println)
    println((0..6).map(::factorial).fold(5) { acc, i -> acc + i })
     */

    println((0..6).map(::factorial).fold(StringBuilder()) { acc, i ->
        acc.append(i).append(",")
    })

    println((0..6).joinToString(","))
}

fun factorial(n: Int): Int {
    if (n == 0) return 1
    return (1..n).reduce { acc, i -> acc * i }
}

class PDFPrinter {
    fun println(any: Any) {
        kotlin.io.println(any)
    }
}

class Hello {
    fun world() {
        println("Hello World")
    }
}


