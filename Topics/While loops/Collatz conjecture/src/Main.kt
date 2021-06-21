fun main(args: Array<String>) {
    var n = readLine()!!.toInt()
    var result = 0
    print("$n ")
    while (n != 1) {
        result = calculateSiracusseProblem(n)
        n = result
        print("$n ")
    }
}
fun calculateSiracusseProblem(n: Int): Int {
    if (n % 2 == 0) {
        return n / 2
    } else return n * 3 + 1
}
