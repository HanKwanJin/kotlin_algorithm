class 문자열다루기기본 {
    fun solution(s: String): Boolean {
        return s.all {
            it.isDigit()
        } && (s.length == 4 || s.length == 6)
    }
}