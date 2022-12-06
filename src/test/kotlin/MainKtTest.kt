import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MainKtTest {
    @Test
    fun `add two numbers correctly`() {
        kotlin.test.assertEquals(3, addTwoNumbers(1, 2))
    }

    @Test
    fun `add two numbers test`() {
        kotlin.test.assertEquals(10, addTwoNumbers(1, 9))
    }

    @Test
    fun `add two strings correctly`() {
        kotlin.test.assertEquals("ab", addTwoStrings("a", "b"))
    }

    @Test
    fun `add two strings test`() {
        kotlin.test.assertEquals("12", addTwoStrings("1", "2"))
    }
}