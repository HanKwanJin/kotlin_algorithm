import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

//덩치
fun main() = with(System.`in`.bufferedReader()){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val arr = mutableListOf<Pair<Int,Int>>()

    repeat(n){
        val st = StringTokenizer(readLine())
        arr.add(Pair(st.nextToken().toInt(), st.nextToken().toInt()))
    }
    repeat(n){ i ->
        var cnt = 1
        repeat(n){ j ->
            if (arr[i].first < arr[j].first && arr[i].second < arr[j].second) cnt++
        }
        bw.write("$cnt ")
    }
    bw.flush()
    bw.close()
}