class 최대공약수와최소공배수 {
    fun solution(n: Int, m: Int): IntArray {
        var answer = intArrayOf()
        var mx = 0
        for(i in 1 .. m){
            if(n % i == 0 && m % i == 0){
                mx = kotlin.math.max(mx, i)
            }
        }
        answer += mx
        answer += (mx * (n/mx) * (m/mx))

        return answer
    }
}