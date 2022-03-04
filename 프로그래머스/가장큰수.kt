class 가장큰수 {
    fun solution(numbers: IntArray): String {
        val tmp = arrayListOf<String>()
        numbers.forEach {
            tmp += it.toString()
        }
        tmp.sortWith(Comparator { o1, o2 ->
            if (o1.length == o2.length) {
                o2.compareTo(o1)
            }else {
                (o2+o1).compareTo(o1+o2)
            }
        })
        if (tmp[0] == "0"){
            return "0"
        }else{
            return tmp.joinToString("")
        }
    }
}