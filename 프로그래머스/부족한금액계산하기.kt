import kotlin.math.abs

class 부족한금액계산하기 {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = 0
        for (i in 1 .. count){
            answer += price * i
        }
        return if (money > answer) 0 else abs(answer-money)
    }
}