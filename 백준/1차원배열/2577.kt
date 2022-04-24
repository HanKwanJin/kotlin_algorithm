fun main() = with(System.`in`.bufferedReader()){
    var sum = 1
    repeat(3){
        val num = readLine().toInt()
        sum *= num
    }
    val arr = IntArray(10) {0}
    while (sum > 0){
        arr[sum % 10]++
        sum /= 10
    }
    for (i in 0..9){
        println(arr[i])
    }
}