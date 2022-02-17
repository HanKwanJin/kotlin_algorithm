fun solution2(numbers: IntArray): IntArray {
    var answer: IntArray = intArrayOf()
    for(i in 0 until numbers.size-1){
        for(j in i+1 until numbers.size){
            answer += numbers[i] + numbers[j]
        }
    }
    return answer.distinct().toIntArray().sortedArray()
}