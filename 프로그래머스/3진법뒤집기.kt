fun solution(n: Int): Int {
    return n.toString(3).reversed().toInt(3)
    //toString(i) : i진법으로 변환
    //toInt(i) : i진법으로 표현된 것을 10진수로 변환
}
fun main(){
    print( solution(125))
}