fun main() {
    val (a, b, c) = List(3) { readLine()!!.toDouble() }
    val result = (c - b) / a
    println(result)

}