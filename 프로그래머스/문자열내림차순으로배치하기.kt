class 문자열내림차순으로배치하기 {
    fun solution(s: String): String {
        var answer = ""
        s.toList().sortedDescending().forEach {
            answer += it
        }
        return answer
    }
}