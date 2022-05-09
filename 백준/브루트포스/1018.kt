import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

//체스판 다시 칠하기
fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val st = StringTokenizer(readLine())
    val y = st.nextToken().toInt()
    val x = st.nextToken().toInt()
    val board = Array(y){CharArray(x)}
    val wb = Array<CharArray>(y){
        charArrayOf('W', 'B', 'W', 'B', 'W', 'B', 'W', 'B')
        charArrayOf('B', 'W', 'B', 'W', 'B', 'W', 'B', 'W')
        charArrayOf('W', 'B', 'W', 'B', 'W', 'B', 'W', 'B')
        charArrayOf('B', 'W', 'B', 'W', 'B', 'W', 'B', 'W')
        charArrayOf('W', 'B', 'W', 'B', 'W', 'B', 'W', 'B')
        charArrayOf('B', 'W', 'B', 'W', 'B', 'W', 'B', 'W')
        charArrayOf('W', 'B', 'W', 'B', 'W', 'B', 'W', 'B')
        charArrayOf('B', 'W', 'B', 'W', 'B', 'W', 'B', 'W')
    }

    val bw = Array<CharArray>(st.nextToken().toInt()){
        charArrayOf('B', 'W', 'B', 'W', 'B', 'W', 'B', 'W')
        charArrayOf('W', 'B', 'W', 'B', 'W', 'B', 'W', 'B')
        charArrayOf('B', 'W', 'B', 'W', 'B', 'W', 'B', 'W')
        charArrayOf('W', 'B', 'W', 'B', 'W', 'B', 'W', 'B')
        charArrayOf('B', 'W', 'B', 'W', 'B', 'W', 'B', 'W')
        charArrayOf('W', 'B', 'W', 'B', 'W', 'B', 'W', 'B')
        charArrayOf('B', 'W', 'B', 'W', 'B', 'W', 'B', 'W')
        charArrayOf('W', 'B', 'W', 'B', 'W', 'B', 'W', 'B')
    }

}