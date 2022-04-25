
fun main() = with(System.`in`.bufferedReader()){
    for (i in 1..readLine().toInt()){
        val arr = readLine().split(" ").map { it.toDouble() }
        var avg = 0.0
        for (i in 1..arr.lastIndex){
            avg += arr[i]
        }
        avg /= arr[0]
        var n = 0
        for (i in 1..arr.lastIndex){
            if (arr[i] > avg){
                ++n
            }
        }
        val ret = n / arr[0]
        println("${String.format("%.3f", ret * 100)}%")
    }
}