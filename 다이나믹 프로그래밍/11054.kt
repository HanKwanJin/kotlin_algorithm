import kotlin.math.max

//가장 긴 바이토닉 부분 수열
fun main(){
    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }
    val dp = IntArray(n){1}
    for(i in 1 until n){
        for(j in 0 until i){
            if(arr[i] > arr[j]){
                dp[i] = max(dp[i], dp[j]+1)
            }
        }
    }
    for(i in 1 until n){
        for(j in 0 until i){
            if(arr[i] < arr[j]){
                dp[i] = max(dp[i], dp[j]+1)
            }
        }
    }
    println(dp.maxOrNull()!!)
}