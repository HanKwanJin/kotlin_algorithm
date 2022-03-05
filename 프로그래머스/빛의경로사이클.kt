class 빛의경로사이클 {
    val dx = intArrayOf(1,0,-1,0)
    val dy = intArrayOf(0,1,0,-1)
    fun solution(grid: Array<String>): IntArray {
        var answer = mutableListOf<Int>()
        val visit = Array<Array<BooleanArray>>(grid.size){
            Array<BooleanArray>(grid[it].length) { BooleanArray(4) }
        }
        for (i in visit.indices){
            for (j in visit[i].indices){
                for(k in visit[i][j].indices){
                    if (!visit[i][j][k]) answer.add(getLightLen(grid,visit,i,j,k))
                }
            }
        }
        return answer.sorted().toIntArray()
    }

    private fun getLightLen(grid: Array<String>, visit: Array<Array<BooleanArray>>, i: Int, j: Int, dir: Int): Int {
        var y = i
        var x = j
        var cnt = 0
        var d = dir
        while (!visit[y][x][d]){
            cnt++
            visit[y][x][d] = true
            when(grid[y][x]) {
                'L' -> d = getDirection(d-1)
                'R' -> d = getDirection(d+1)
            }
            x = (x + dx[d] + grid[0].length) % grid[0].length
            y = (y + dy[d] + grid.size) % grid.size
        }
        return cnt
    }

    private fun getDirection(d: Int) = if (d < 0) 3 else d % 4

}