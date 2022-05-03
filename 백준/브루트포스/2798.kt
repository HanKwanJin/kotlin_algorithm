import java.util.*
//블랙잭
fun main() = with(System.`in`.bufferedReader()) {
    val t = StringTokenizer(readLine())
    val n = t.nextToken().toInt()
    val m = t.nextToken().toInt()
    val arr = readLine().split(" ").map { it.toInt() }.toIntArray()
    val list = mutableListOf<Int>()
    for (i in 0 until arr.lastIndex - 1) {
        for (j in i + 1 until arr.lastIndex) {
            for (k in j + 1..arr.lastIndex) {
                if (m >= arr[i] + arr[j] + arr[k]){
                    list.add(arr[i] + arr[j] + arr[k])
                }
            }
        }
    }
    var ret = list[0]
    for (i in list.indices){
        if (m - ret > m - list[i]){
            ret = list[i]
        }
    }
    print(ret)
}