class x만큼간격이있는n개의숫자 {
    fun solution(x: Int, n: Int): LongArray {
        var answer = longArrayOf()
        var num = x
        for (i in 1 .. n){
            answer += x.toLong() * i
        }
        return answer
    }
}