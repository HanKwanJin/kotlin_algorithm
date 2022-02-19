class 하샤드수 {
    fun solution(x: Int): Boolean {
        var n = 0
        x.toString().toList().forEach {
            n += it - '0'
        }
        return x % n == 0
    }
}