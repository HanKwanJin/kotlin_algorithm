fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
    val reportPairList = report.map { it.split(" ").let { (f,s) -> f to s } }.distinct()
    val blackList = reportPairList.groupBy { it.second }
        .filter { it.value.size >= k }
        .map { it.key } //이름들
    val mailCountMap = reportPairList.groupBy { it.first } //신고자
        .map { it.key to it.value.map { target -> target.second }.filter(blackList::contains).size }
        .toMap()
    return id_list.map { mailCountMap[it] ?: 0 }.toIntArray()
}
fun main(){
    solution(arrayOf("muzi", "frodo", "apeach", "neo"), arrayOf("muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"),2)
        .forEach {
            println(it)
        }
}