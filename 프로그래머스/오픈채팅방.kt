class 오픈채팅방 {
    fun solution(record: Array<String>): Array<String> {
        var answer = mutableMapOf<String,String>()
        record.forEach {
            val r = it.split(" ")
            when(r[0]){
                "Enter" -> {
                    answer[r[1]] = r[2]
                }
                "Change" -> {
                    answer[r[1]] = r[2]
                }
            }
        }
        val ret = record.map {
            val action = it.split(" ")
            when(action[0]){
                "Enter" -> {
                    "${answer[action[1]]}님이 들어왔습니다."
                }
                "Leave" -> {
                    "${answer[action[1]]}님이 나갔습니다."
                }
                else -> ""
            }
        }.filter { it != "" }.toTypedArray()
        return ret
    }
}