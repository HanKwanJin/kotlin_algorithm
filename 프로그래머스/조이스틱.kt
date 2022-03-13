import kotlin.math.min

class 조이스틱 {
    fun solution(name: String): Int {
        var answer = 0
        var next: Int
        var move = name.length - 1
        for (i in name.indices){
            answer += min(name[i] - 'A', 'Z' - name[i] + 1)
            next = i + 1
            while (next < name.length && name[next] == 'A'){
                next++
            }
            move = min(move, i*2 + name.length - next)
            move = min(move, (name.length - next) * 2 + i)
        }
        return answer + move
    }
}