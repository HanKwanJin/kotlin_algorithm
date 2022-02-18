import kotlin.math.max

class 최소직사각형 {
    fun solution(sizes: Array<IntArray>): Int {
        var a = 0
        var b = 0
        for (arr in sizes){
            arr.sort()
            a = arr[0].coerceAtLeast(a)
            b = arr[1].coerceAtLeast(b)
        }
        return a * b
    }
}