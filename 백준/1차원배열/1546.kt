fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    var arr = readLine().split(" ").map { it.toInt() }
    var sum = 0.0
    repeat(n){
        sum += arr[it].toDouble() / arr.maxOrNull()!!.toDouble() * 100.0
    }
    print(sum / n.toDouble())
}