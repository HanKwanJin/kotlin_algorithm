class 정수제곱근판별 {
    fun solution(n: Long): Long {
        val a = kotlin.math.sqrt(n.toDouble()).toLong()
        return if(a * a == n) (a+1)*(a+1) else -1
    }
}