class `2개이하로다른비트` {
    fun solution(numbers: LongArray): LongArray {
        var answer: LongArray = longArrayOf()
        for (i in numbers.indices){
            answer += if (numbers[i] % 2 == 0L) {
                numbers[i] + 1
            }else{
                var target = (numbers[i] + 1) and (-numbers[i])
                (numbers[i] or target) and (target shr 1).inv()
            }

        }
        return answer
    }
}