
class 예상대진표 {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 1
        var aa = a
        var bb = b
        var nn = n
        while (n / 2 != 1) {
            if (aa % 2 == 1) {
                aa = aa / 2 + 1
            } else {
                aa /= 2
            }
            if (bb % 2 == 1) {
                bb = bb / 2 + 1
            } else {
                bb /= 2
            }
            if (aa == bb) break
            nn /= 2
            answer++
        }
        return answer
    }
}