import java.util.Scanner // a class (type) from the Java standard library

fun main() {
    val scanner = Scanner(System.`in`) // reads data

    val num1 = scanner.nextLine() // reads the first number
    val num2 = scanner.nextInt() // reads the second number
    val num3 = scanner.next()

    println(num2) // prints the second number
    println(num1) // prints the first number
}
