//그룹단어체커
private fun chk(s: String):Boolean{
    val set = mutableSetOf<Char>()
    var tmp = s[0]
    set.add(s[0])
    for (i in 1..s.lastIndex){
        if (tmp == s[i]) continue
        if (set.contains(s[i])) return false
        tmp = s[i]
        set.add(s[i])
    }
    return true
}
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    var ret = 0
    repeat(n){
        if (chk(readLine())){
            ret++
        }
    }
    print(ret)
}