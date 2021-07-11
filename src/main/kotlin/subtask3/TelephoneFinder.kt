package subtask3

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        //throw NotImplementedError("Not implemented")
        val validInput = number.indexOf('-') == -1
        var res = mutableListOf<String>()
        var res2 : Array<String> = arrayOf()

        if (validInput){

            number.forEachIndexed { index, c ->
                when (c){
                    '1' -> {
                        res.add(number.replaceRange(index, index+1, "2"))
                        res.add(number.replaceRange(index, index+1, "4"))
                    }
                    '2' -> {
                        res.add(number.replaceRange(index, index+1, "1"))
                        res.add(number.replaceRange(index, index+1, "3"))
                        res.add(number.replaceRange(index, index+1, "5"))
                    }
                    '3' -> {
                        res.add(number.replaceRange(index, index+1, "2"))
                        res.add(number.replaceRange(index, index+1, "6"))
                    }
                    '4' -> {
                        res.add(number.replaceRange(index, index+1, "1"))
                        res.add(number.replaceRange(index, index+1, "5"))
                        res.add(number.replaceRange(index, index+1, "7"))
                    }
                    '5' -> {
                        res.add(number.replaceRange(index, index+1, "2"))
                        res.add(number.replaceRange(index, index+1, "4"))
                        res.add(number.replaceRange(index, index+1, "6"))
                        res.add(number.replaceRange(index, index+1, "8"))
                    }
                    '6' -> {
                        res.add(number.replaceRange(index, index+1, "3"))
                        res.add(number.replaceRange(index, index+1, "5"))
                        res.add(number.replaceRange(index, index+1, "9"))
                    }
                    '7' -> {
                        res.add(number.replaceRange(index, index+1, "8"))
                        res.add(number.replaceRange(index, index+1, "4"))
                    }
                    '8' -> {
                        res.add(number.replaceRange(index, index+1, "5"))
                        res.add(number.replaceRange(index, index+1, "7"))
                        res.add(number.replaceRange(index, index+1, "0"))
                        res.add(number.replaceRange(index, index+1, "9"))
                    }
                    '9' -> {
                        res.add(number.replaceRange(index, index+1, "6"))
                        res.add(number.replaceRange(index, index+1, "8"))
                    }
                    '0' -> {
                        res.add(number.replaceRange(index, index+1, "8"))
                    }

                }
            }

           /* if (!res.contains((number.toInt()+1).toString())){
                res.add((number.toInt()+1).toString())
            }
            if (!res.contains((number.toInt()-1).toString())){
                res.add((number.toInt()-1).toString())
            }*/

            res2 = res.toTypedArray()
        }
        return if (validInput) res2 else null
    }
}
