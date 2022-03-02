class 튜플 {
    fun solution(s: String): IntArray {
        var answer = mutableListOf<Int>()
        val tuple = mutableMapOf<String, Int>()
        s.split("{", "}", "},").filter { it != "," }
            .forEach {
                val list = it.split(",")
                list.forEach { n ->
                    if (tuple[n] == null){
                        tuple[n] = 0
                    }else{
                        tuple[n] = tuple[n]!! + 1
                    }
                }
            }
        val mapToList = tuple.toList().sortedByDescending { it.second}
        mapToList.forEach {
            if (it.first.toIntOrNull() != null){
                answer.add(it.first.toInt())
            }
        }
        return answer.toIntArray()
    }
}
fun main(){
    val sol = 튜플()
    sol.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")
        .forEach { println(it) }
}