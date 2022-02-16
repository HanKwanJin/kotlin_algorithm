fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
    var answer = intArrayOf()
    for (i in commands){
        val tmp = array.sliceArray(i[0]-1 until i[1]).sorted()[i[2]-1]
        answer += tmp
    }
    return answer
}
fun main(){
    solution(intArrayOf(1,5,2,6,3,7,4), arrayOf(intArrayOf(2,5,3), intArrayOf(4,4,1), intArrayOf(1,7,3)))
        .forEach {
            print("$it ")
        }
}