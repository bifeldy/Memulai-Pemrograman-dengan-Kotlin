fun main() {
    println("Factorial 99999 is: ${factorial(99999)}")
}


fun factorial(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorial(n - 1)
    }
}