import kotlin.math.*

class N개의최소공배수 {
    fun solution(arr: IntArray): Int {
        arr.sort()
        var answer = arr[0]
        for (i in 1 until arr.size){
            var gcd = gcd(answer, arr[i])
            answer *= arr[i] / gcd
        }
        return answer
    }
    private tailrec fun gcd(a: Int, b: Int): Int{
        var A = max(a,b)
        var B = min(a,b)
        if (B == 0){
            return max(a,b)
        }else{
            return gcd(B, A % B)
        }
    }
}