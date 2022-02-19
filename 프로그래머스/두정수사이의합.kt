class 두정수사이의합 {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        var st = 0
        var en = 0
        if(a > b){
            st = b
            en = a
        }else {
            st = a
            en = b
        }
        for (i in st..en){
            answer += i
        }
        return answer
    }
}