class JadenCase문자열만들기 {
    fun solution(s: String): String =
        s.toLowerCase().split(" ").joinToString(" ") { it.capitalize() }
    //capitalize -> 앞자리 대문자 만들어줌
}