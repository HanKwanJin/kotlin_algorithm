import kotlin.math.sqrt

class 소수찾기 {
    lateinit var set: MutableSet<Int>
    fun solution(numbers: String): Int {
        set = mutableSetOf()
        getCombination(numbers, "")
        return set.count { isPrime(it) }
    }

    private fun getCombination(numbers: String, result: String) {
        if (result.isNotEmpty()) set.add(result.toInt())
        if (numbers.isEmpty()) return
        numbers.forEachIndexed { index, c ->
            getCombination(numbers.removeRange(index..index), c.plus(result))
        }
    }

    private fun isPrime(number: Int): Boolean{
        if (number == 1 || number == 0) return false
        for (i in (2..(number/2))){
            if (number % i == 0) return false
        }
        return true
    }
}