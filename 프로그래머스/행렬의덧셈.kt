class 행렬의덧셈 {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = arrayOf<IntArray>()
        answer = arr1.mapIndexed{ index, ints ->
            ints.mapIndexed { idx , i ->
                i + arr2[index][idx]
            }.toIntArray()
        }.toTypedArray()
        return answer
    }
}