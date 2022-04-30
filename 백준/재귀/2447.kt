//별 찍기 - 10
private lateinit var board:Array<CharArray>
tailrec fun star10(y: Int, x:Int, n:Int){
    if (n == 1){
        board[y][x] = '*'
        return
    }
    for (i in 0 until 3){
        for (j in 0 until 3){
            if (i == 1 && j == 1) continue
            star10(y + n/3 * i, x + n/3 * j, n/3)
        }
    }
}
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    board = Array(n){CharArray(n){' '} }
    star10(0,0,n)
    repeat(n){ y ->
        println(board[y])
    }
}