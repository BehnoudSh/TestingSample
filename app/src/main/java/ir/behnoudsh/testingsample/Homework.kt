package ir.behnoudsh.testingsample

object Homework {

    /**
     * Returns the n-th fibonacci number
     * fib(0) = 0
     * fib (1) = 1
     * fib(n) = fib(n-2) + fib(n-1)
     */
    fun fib(n: Int): Long {

        if (n == 0 || n == 1) {

            return n.toLong()
        }
        var a = 0L
        var b = 1L
        var c = 1L

        (1 until n).forEach { i ->

            c = a + b
            a = b
            b = c

        }

        return c
    }

    /**
     * checks if the braces are set correctly
     * for example "(a*b))" should return false
     */

    fun checkBraces(string: String): Boolean {

        val firstBoolean: Boolean = string.count { it == '(' } == string.count { it == ')' }
        var secondBoolean: Boolean = false

        if (string[0] == '(' && string[string.length - 1] == ')')
            secondBoolean = true

        return firstBoolean && secondBoolean

    }
}