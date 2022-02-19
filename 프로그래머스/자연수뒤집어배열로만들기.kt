class 자연수뒤집어배열로만들기 {
    fun solution(n: Long): IntArray {
        var answer = intArrayOf()
        n.toString().toList().reversed().forEach {
            answer += it - '0'
        }
        return answer
    }
}