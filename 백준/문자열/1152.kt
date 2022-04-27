import java.util.*
//단어의 개수
fun main() = with(System.`in`.bufferedReader()) {
    var st = StringTokenizer(readLine())
    print(st.countTokens())
    this.close()
}