fun solution(answers: IntArray): IntArray {
    var answer = intArrayOf()
    val first = intArrayOf(1,2,3,4,5)
    val second = intArrayOf(2,1,2,3,2,4,2,5)
    val third = intArrayOf(3,3,1,1,2,2,4,4,5,5)
    var mx = 0
    var f = 0
    var s = 0
    var th = 0
    var fidx = 0
    var sidx = 0
    var thidx = 0
    for(i in answers.indices){
        if(answers[i] == first[fidx]){
            f++
            mx = mx.coerceAtLeast(f)
        }
        if(answers[i] == second[sidx]){
            s++
            mx = mx.coerceAtLeast(s)
        }
        if(answers[i] == third[thidx]){
            th++
            mx = mx.coerceAtLeast(th)
        }
        fidx++
        sidx++
        thidx++
        if(fidx > first.size-1) fidx = 0
        if(sidx > second.size-1) sidx = 0
        if(thidx > third.size-1) thidx = 0

    }
    if(f == mx) answer += 1
    if(s == mx) answer += 2
    if(th == mx) answer += 3
    answer.sort()
    return answer
}

fun main(){
    solution(intArrayOf(1,3,2,4,2))
        .forEach {
            println(it)
        }
}