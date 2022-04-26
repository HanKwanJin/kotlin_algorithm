//숫자의 합
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val arr = readLine().split("").filter { it != "" }.sumOf { it.toInt() }
    print(arr)
}
//fun main(){
//    readLine()
//    println(readLine()!!.fold(0) { sum, c -> sum + c.toString().toInt() })
//}