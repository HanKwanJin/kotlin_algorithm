//전깃줄
import kotlin.math.max
fun main(){
    val n = readLine()!!.toInt()
    val cables = mutableListOf<Pair<Int, Int>>()
    repeat(n){
        val cable = readLine()!!.split(" ").map { it.toInt() }
        cables.add(Pair(cable[0], cable[1]))
    }
    cables.sortWith(compareBy { it.first })
    val dp = IntArray(n){1}
    for(i in 1 until  n){
        for(j in 0 until i){
            if(cables[i].second > cables[j].second){
                dp[i] = max(dp[i], dp[j]+1)
            }
        }
    }
    println(n-dp.maxOrNull()!!)
}