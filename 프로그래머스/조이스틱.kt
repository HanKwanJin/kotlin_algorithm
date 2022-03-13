import kotlin.math.min

class 조이스틱 {
    fun solution(name: String): Int {
        var answer = 0
        var move = name.length - 1
        for (i in name.indices){
            var next = i + 1
            while (next < name.length && name[next] == 'A'){
                next++
            }
            move = min(move, i+name.length-next + i)
            if (name[i] != 'A'){
                var tmp = name[i].toInt() - 65
                if (tmp >= 13) {
                    tmp = 26-tmp
                }
                answer += tmp
            }
        }
        return answer + move
    }
}