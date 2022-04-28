//크로아티아 알파벳
fun main() = with(System.`in`.bufferedReader()){
    var s = readLine()
    val arr = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    arr.forEach {
        s = s.replace(it, "1")
    }
    print(s.length)
}