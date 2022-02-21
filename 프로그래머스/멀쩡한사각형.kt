import kotlin.math.*

class 멀쩡한사각형 {
    private fun gcd(a: Long, b: Long): Long{
        return if (b == 0L) a
        else gcd(b, a%b)
    }
    fun solution(w: Int, h: Int): Long {
        val wl = w.toLong()
        val hl = h.toLong()
        val answer = wl * hl
        return answer - (wl + hl - gcd(wl,hl))
    }
}