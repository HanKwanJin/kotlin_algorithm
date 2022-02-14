//ATM
fun main(){
    val n = readLine()!!.toInt()
    var arr = readLine()!!.split(" ").map { it.toInt() }.sorted()
    var cur = 0
    var sum = 0

    for(i in 0 until n){
        cur += arr[i]
        sum += cur
    }
    println(sum)
}