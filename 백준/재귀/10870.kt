//피보나치수5
private tailrec fun f(n: Int): Int{
    if (n == 0) return 0
    if (n == 1) return 1
    return f(n-1) + f(n-2)
}
fun main() = with(System.`in`.bufferedReader()){
    print(f(readLine().toInt()))
}