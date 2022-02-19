class 정수내림차순으로배치하기 {
    fun solution(n: Long): Long =
        n.toString().toList().sortedDescending().joinToString("").toLong()
}