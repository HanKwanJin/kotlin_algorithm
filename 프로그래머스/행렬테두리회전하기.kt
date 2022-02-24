class 행렬테두리회전하기 {
    private fun min(a: Int, b: Int): Int{
        return if (a < b) a else b
    }
    fun solution(rows: Int, columns: Int, queries: Array<IntArray>): IntArray {
        var answer = intArrayOf()
        var board = Array(rows) { Array(columns){0} }
        var cnt = 1
        for (i in 0 until rows){
            for (j in 0 until columns){
                board[i][j] = cnt
                cnt++
            }
        }
        for (i in queries.indices){
            val x = queries[i][0] - 1
            val y = queries[i][1] - 1
            val xx = queries[i][2] - 1
            val yy = queries[i][3] - 1
            val tmp = board[x][y]
            var mn = tmp
            for (j in x until xx){
                board[j][y] = board[j+1][y]
                mn = min(mn, board[j][y])
            }
            for (j in y until yy){
                board[xx][j] = board[xx][j+1]
                mn = min(mn, board[xx][j])
            }
            for (j in xx downTo  x + 1){
                board[j][yy] = board[j-1][yy]
                mn = min(mn, board[j][yy])
            }
            for (j in yy downTo y+1){
                board[x][j] = board[x][j-1]
                mn = min(mn, board[x][j])
            }

            board[x][y+1] = tmp
            answer += mn
        }

        return answer
    }
}