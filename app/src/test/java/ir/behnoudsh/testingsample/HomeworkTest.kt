package ir.behnoudsh.testingsample

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HomeworkTest {

    @Test
    fun `first element should return 0`() {


        val result = Homework.fib(0)

        assertThat(result).isEqualTo(0)

    }


    @Test
    fun `second element should return 1`() {


        val result = Homework.fib(1)

        assertThat(result).isEqualTo(1)

    }


    @Test
    fun `sixth element should return 8`() {


        val result = Homework.fib(6)

        assertThat(result).isEqualTo(8)

    }

    @Test
    fun `twenieth element should return 6765`() {


        val result = Homework.fib(20)

        assertThat(result).isEqualTo(6765)

    }


    @Test
    fun `() should return true`() {


        val result = Homework.checkBraces("()")

        assertThat(result).isTrue()

    }

    @Test
    fun `(a*b)) should return false`() {


        val result = Homework.checkBraces("(a*b))")

        assertThat(result).isFalse()

    }

    @Test
    fun `)( should return false`() {


        val result = Homework.checkBraces(")(")

        assertThat(result).isFalse()

    }
}