//재귀함수가 뭔가요?
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.")
    for (i in 0 until n){

        repeat(i) { print("____") }
        println("\"재귀함수가 뭔가요?\"")

        repeat(i) { print("____") }
        println("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.")

        repeat(i) { print("____") }
        println("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.")

        repeat(i) { print("____") }
        println("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"")

    }
    repeat(n) { print("____") }
    println("\"재귀함수가 뭔가요?\"")

    repeat(n) { print("____") }
    println("\"재귀함수는 자기 자신을 호출하는 함수라네\"")

    for (i in n downTo 0){
        repeat(i) { print("____") }
        println("라고 답변하였지.")
    }
}

/*
val s = "____".repeat(n)
print("${s}")
위 코드처럼 반복되는 문자열을 처리할 수 있다
 */