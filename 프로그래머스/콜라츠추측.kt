class 콜라츠추측 {
    fun solution(num: Int): Int {
        var cnt = 0
        var tmp = num.toLong()
        while (cnt < 500 && tmp > 1){
            cnt++
            tmp = if (tmp % 2 == 0L) tmp / 2 else tmp * 3 + 1
        }
        return if (cnt == 500) -1 else cnt
    }
}