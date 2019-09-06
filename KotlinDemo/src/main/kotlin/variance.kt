/**
 * Created by CHULEI on 2019/8/30.
 */
fun main() {
    // 协变
    val numberList: List<Number> = listOf(1, 2, 3)

    // 逆变
    val intComparable: Comparable<Int> = object : Comparable<Int> {
        override fun compareTo(other: Int): Int {
            return 0
        }

    }

    // 不变
    val numberArrayList: MutableList<Number> = mutableListOf(1, 2, 3)


}
