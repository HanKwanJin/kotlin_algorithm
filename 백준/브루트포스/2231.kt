//분해합
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    for (i in 1 .. n){
        var ret = 0
        ret = i + i.toString().split("").filter { it != "" }.fold(0) {sum, it -> sum + it.toInt()}
        if (ret == n){
            print(i)
            return
        }
    }
    print(0)
}