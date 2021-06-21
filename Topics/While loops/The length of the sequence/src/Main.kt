fun main() {
    var count = 0
    do {
        val input = readLine()!!.toInt()
        if (input != 0) count++
    } while (input != 0)
    println(count)
}
