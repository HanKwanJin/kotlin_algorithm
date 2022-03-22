class 피보나치수 {
    fun solution(n: Int): Int {
        val arr = IntArray(n+1) { 0 }
        arr[0] = 0
        arr[1] = 1
        for (i in 2..n){
            arr[i] = (arr[i-1] % 1234567 + arr[i-2] % 1234567) % 1234567
        }
        return arr[n] % 1234567
    }
}

fun main() {
    val cl = 피보나치수()
    print(cl.solution(3))

}
