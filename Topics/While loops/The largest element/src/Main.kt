fun main() {
    var num: Int
    var maxNum: Int = 0
    do {
        num = readLine()!!.toInt()
        if (maxNum < num) maxNum = num
    } while (num > 0)

    println(maxNum)
}