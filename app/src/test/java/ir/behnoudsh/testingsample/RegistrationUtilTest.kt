package ir.behnoudsh.testingsample


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {

        val result = RegistrationUtil.validateRegistrationInput(
            "", "123", "123"
        )

        assertThat(result).isFalse()

    }

    @Test
    fun `valid username and correctly repeated password returns true`() {

        val result = RegistrationUtil.validateRegistrationInput(
            "Emad", "123", "123"
        )

        assertThat(result).isTrue()

    }

    @Test
    fun `username already exixts returns false`() {

        val result = RegistrationUtil.validateRegistrationInput(
            "Behnoud", "123", "123"
        )

        assertThat(result).isFalse()

    }

    @Test
    fun `empty password returns false`() {

        val result = RegistrationUtil.validateRegistrationInput(
            "Tina", "", ""
        )

        assertThat(result).isFalse()

    }

    @Test
    fun `incorrectly confirmed password returns false`() {

        val result = RegistrationUtil.validateRegistrationInput(
            "Tina", "123", "1234"
        )

        assertThat(result).isFalse()

    }

    @Test
    fun `less than 2 digit password returns false`() {

        val result = RegistrationUtil.validateRegistrationInput(
            "Tina", "abcdef", "abcdef"
        )

        assertThat(result).isFalse()

    }
}