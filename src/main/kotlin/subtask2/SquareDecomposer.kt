package subtask2

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        var res = mutableListOf(number.toLong()-1)
        var res2 : Array<Int> = arrayOf()
        var resSqr = 0L
        val numSqr = number.toLong()*number.toLong()
        val validInput = (number > 2)

        if (validInput) {
            while (true) {
                resSqr = res.map { it * it }.sum()
                if (numSqr == resSqr)
                    break
                else if (numSqr > resSqr) {
                    res.add(res[res.lastIndex] - 1)
                    if (res.size > 2) {
                        if (res[res.lastIndex] == 0L) {
                            res = res.take(res.size - 2).toMutableList()
                            res[res.lastIndex]--
                        }
                    }
                } else if (numSqr < resSqr) {
                    res[res.lastIndex]--
                }
            }

            res.reverse()

            for (i in res) {
                res2 = res2.plus(i.toInt())
            }
        }

        return if (validInput) res2 else null
    }
}
