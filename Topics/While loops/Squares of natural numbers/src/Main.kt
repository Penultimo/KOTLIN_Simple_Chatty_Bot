fun main() {
    val input = readLine()!!.toInt()
    var i = 1
    var result = 0
    while (result < input) {
        result = i * i
        if (result > input) break
        println(result)
        i++
    }
}