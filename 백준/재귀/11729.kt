//하노이 탑 이동 순서
import java.io.*
fun main() = with(System.`in`.bufferedReader()){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()

    println((1 shl n) - 1)
    fun hanoi(a: Int, b:Int, n:Int){
        if (n == 1){
            bw.write("$a $b\n")
            return
        }
        hanoi(a, 6-a-b, n-1)
        bw.write("$a $b\n")
        hanoi(6-a-b, b, n-1)
    }
    hanoi(1,3,n)
    bw.flush()
    bw.close()
}