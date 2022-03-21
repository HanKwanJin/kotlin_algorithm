class `H-Index` {
    fun solution(citations: IntArray): Int {
        val arr = citations.sortedArrayDescending()
        arr.forEachIndexed { index, i ->
            if (i < index + 1){
                return index
            }
        }
        return arr.size
    }
}