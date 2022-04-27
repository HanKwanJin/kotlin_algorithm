//단어 공부
fun main() = with(System.`in`.bufferedReader()){
    val s = readLine().lowercase()
    val map = mutableMapOf<Char, Int>()
    s.forEach {
        map[it] = (map[it] ?: 0) + 1
    }
    val mx = map.values.maxOrNull()
    map.filter { it.value == mx }.keys.let {
        if (it.size > 1){
            print("?")
        }else{
            print(it.joinToString("").uppercase())
        }
    }
}