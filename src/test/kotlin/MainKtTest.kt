import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun remindName(function: () -> Unit) {
        //arrange
        val nameTest = "Sasha"
        val expected = "What a great name you have, ${nameTest}!"

        // act
        val result = remindName() {
            val name = scanner.nextLine()
            println("What a great name you have, ${name}!")
        }

        // assert
        assertEquals(expected, result)
    }

    @Test
    fun guessAge() {
    }

    @Test
    fun count() {
    }

    @Test
    fun knowledge() {
    }

    @Test
    fun end() {
    }
}