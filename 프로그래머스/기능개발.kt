import kotlin.math.ceil

class 기능개발 {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = intArrayOf()
        var days = progresses
        for (i in progresses.indices){
            days[i] = ceil((100 - progresses[i]) / speeds[i].toDouble()).toInt()
        }
        var mx = days[0]
        var releaseDay = 1
        for (i in 1 until days.size){
            if (mx < days[i]){
                answer += releaseDay
                mx = days[i]
                releaseDay = 1
            }else{
                releaseDay++
            }
        }
        answer += releaseDay
        return answer
    }
}