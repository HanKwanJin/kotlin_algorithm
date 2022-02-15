fun main(){
    val n = readLine()!!.toInt()

    val dist = readLine()!!.split(" ").map { it.toLong() }
    val cost = readLine()!!.split(" ").map { it.toLong() }
    var sum = 0L
    var tmp = 987654321L
    for(i in dist.indices){
        if(cost[i] < tmp){
            tmp = cost[i]
        }
        sum += tmp * dist[i]
    }
    println(sum)
}