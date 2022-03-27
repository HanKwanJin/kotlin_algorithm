class 카펫 {
    /* 다른 사람 풀이
    fun s(brown: Int, yellow: Int): IntArray =
        (1..yellow).filter { yellow % it == 0 }
            .first { brown == (yellow / it * 2) + (it * 2) + 4 } //조건을 만족하는 가장 첫 번째 값을 return함
            .let { intArrayOf(yellow / it + 2, it + 2) }
     */
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf()
        var arr = intArrayOf()
        for (i in 1 .. yellow){
            if (yellow % i == 0){
                arr += i
            }
        }
        for (i in arr) {
            if ((i + 2) * (yellow / i + 2) - i * (yellow / i) == brown && i >= yellow / i) {
                answer += i + 2
                answer += yellow / i + 2
                break
            }
        }
        return answer
    }


}
