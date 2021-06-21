fun main() {
    val inAm = readLine()!!.toInt()
    val (a, b) = List(2) { readLine()!!.toInt() }
    val ab = a + b
    while (inAm > 0){
        if ( a + b >= inAm) {
            println("Error, insufficient funds for the purchase. " +
                    "You have $inAm, but you need $ab")
        } else println("Thank you for choosing us to manage your account! You have ${inAm - ab} money.")
    }

}