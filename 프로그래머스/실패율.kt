fun solution(N: Int, stages: IntArray): IntArray {
    var answer = intArrayOf()
    val people = mutableMapOf<Int, Int>() // index, 사람 수
    val failure = mutableMapOf<Int, Double>()
    stages.forEach {
        when(people.containsKey(it)){
            true -> {
                people[it] = people.getValue(it) + 1
            }
            false -> {
                people[it] = 1
            }
        }
    }
    var total = stages.size
    for(i in 1..N){
        when(people.containsKey(i)){
            true -> {
                failure[i] = people.getValue(i) / total.toDouble()
                total -= people.getValue(i)
            }
            false -> {
                failure[i] = 0.0
            }
        }
    }
    val list = failure.toList().sortedByDescending { it.second }
    for(i in 0 until N){
        answer += list[i].first
    }
    return answer
}
fun main(){
    solution(5, intArrayOf(2,1,2,6,2,4,3,3)).forEach {
        println(it)
    }
}