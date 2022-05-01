import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(System.`in`.bufferedReader()){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    repeat(readLine().toInt()){
        val t = StringTokenizer(readLine())
        bw.write("${t.nextToken().toInt() + t.nextToken().toInt()}\n")
    }
    bw.flush()
    bw.close()
}