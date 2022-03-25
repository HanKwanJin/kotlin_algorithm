class 최대값과최솟값 {
    fun solution(s: String): String {
        var arr = s.split(" ").map { it.toInt() }
        arr = arr.sorted()
        return "${arr.first()} ${arr.last()}"
    }
}