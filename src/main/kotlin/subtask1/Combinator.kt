package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        val m = array[0]
        val n = array[1]
        var x = 0
        var res = 0

        while ((m > res) and (x <= n)){
            x++
            res = (factorial(n)/(factorial(x)*factorial(n-x))).toInt()
        }

        return if (m != res) null else x
    }

    private fun factorial(n: Int): Long = if (n < 2) 1 else n * factorial(n - 1)

}
