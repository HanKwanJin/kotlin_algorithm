fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val arr = readLine().split(" ").map { it.toInt() }
    print("${arr.minOrNull()} ${arr.maxOrNull()}")
}