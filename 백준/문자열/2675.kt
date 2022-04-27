import java.util.*
//문자열 반복
fun main() = with(System.`in`.bufferedReader()){
    repeat(readLine().toInt()){
        val tk = StringTokenizer(readLine())
        val n = tk.nextToken().toInt()
        val s = tk.nextToken()
        s.forEach { c ->
            repeat(n){
                print(c)
            }
        }
        println()
    }
}
