fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    repeat(n){
        val ox = readLine().split("")
        var score = 0
        var ret = 0
        for (i in ox.indices){
            if (ox[i] == "O"){
                ++score
                ret += score
            }else if (ox[i] == "X"){
                score = 0
            }
        }
        println(ret)
    }
}