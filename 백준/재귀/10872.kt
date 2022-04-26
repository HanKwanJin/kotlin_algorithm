//팩토리얼
private var ret = 1
tailrec fun func(n: Int){
    if (n == 1) return
    ret *= n
    func(n-1)
    return
}
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    if (n == 0) println(1)
    else{
        func(n)
        println(ret)
    }
}