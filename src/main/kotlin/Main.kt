fun main() {
    print("Enter number 1: ")
    val num1 = readln().toInt()

    print("Enter number 2: ")
    val num2 = readln().toInt()

    var i = 1
    var result = 1

    while (i <= num2) {
        result *= num1
        i++
    }
    println("$num1 to the power of $num2 is $result")
}