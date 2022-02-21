class 핸드폰번호가리기 {
    fun solution(phone_number: String): String {
        var answer = phone_number.toMutableList()
        for (i in 0 until phone_number.length-4){
            answer[i] =  '*'
        }
        return answer.joinToString("")
    }
}