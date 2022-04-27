//알파벳 찾기
fun main() = with(System.`in`.bufferedReader()){
    val map = mutableMapOf<String,Int>()
    readLine().split("").forEachIndexed { index, c ->
        if (map[c] == null) map[c] = index - 1
    }
    for (i in 'a'..'z'){
        if (map[i.toString()] == null) print("-1 ")
        else{
            print("${map[i.toString()]} ")
        }
    }
}