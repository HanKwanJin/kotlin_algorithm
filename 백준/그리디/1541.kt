//잃어버린 괄호
fun main(){
    val br = System.`in`.bufferedReader()
    val s = br.readLine().split("-").toMutableList()
    if(s[0] == "") s[0] = "0"
    val l = mutableListOf<Int>()
    for(i in s){
        var a = 0
        for(ii in i.split("+")) a += ii.toInt()
        l.add(a)
    }
    for(i in 1 until l.size) l[0] -= l[i]
    println(l[0])
}