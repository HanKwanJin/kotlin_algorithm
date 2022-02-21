fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    var answer = ""
    for (i in 0 until a){
        answer += "*"
    }
    for (i in 0 until b){
        println(answer)
    }
}