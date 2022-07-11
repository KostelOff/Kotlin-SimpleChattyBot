import java.util.Scanner

val scanner = Scanner(System.`in`) // Do not change this line

fun main() {
    greet("CyberKos", "2022") // change it as you need
    remindName()
    guessAge()
    count()
    knowledge()
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is ${assistantName}.")
    println("I was created in ${birthYear}.")
    println("Please, remind me your name.")
}

fun remindName() {
    val name = scanner.nextLine()
    println("What a great name you have, ${name}!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is ${age}; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val num = scanner.nextInt()
    for (i in 0..num) {
        print(i)
        println("!")
    }
}

fun knowledge() {
    println("Let's test your programming knowledge.")
    while (true) {
        println("""Why do we use methods?
1. To repeat a statement multiple times.
2. To decompose a program into several small subroutines.
3. To determine the execution time of a program.
4. To interrupt the execution of a program.""")
        val x = readln().toInt()
        if (x == 2) {
            break
        } else{
            println("Please, try again.")
            continue
        }
    }
}

fun end() {
    println("Congratulations, have a nice day!") // Do not change this text
}
