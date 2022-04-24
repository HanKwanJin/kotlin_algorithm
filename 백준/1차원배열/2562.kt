fun main() = with(System.`in`.bufferedReader()){
    var arr = IntArray(10) {0}
    for (i in 1..9){
        arr[i] = readLine().toInt()
    }
    val mx = arr.maxOrNull()
    print("$mx\n${arr.indexOf(mx!!)}")
}