fun solution1(a: Int, b: Int): String {
    var answer = ""
    val month = intArrayOf(31,29,31,30,31,30,31,31,30,31,30,31)
    val day = arrayListOf("FRI", "SAT", "SUN", "MON", "TUE","WED","THU")
    var tmp = 0
    for(i in 0 until a-1){
        tmp += month[i]
    }
    tmp += b-1
    answer = day[tmp % 7]
    return answer
}