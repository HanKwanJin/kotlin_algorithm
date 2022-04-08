class 피로도 {
    private var visited = BooleanArray(8){ false }
    var max = 0
    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        dfs(k, dungeons, 1)
        return max
    }
    fun dfs(cur: Int, dungeons: Array<IntArray>, depth:Int){
        for (i in dungeons.indices){
            if (!visited[i]){
                visited[i] = true
                if (cur >= dungeons[i][0]){
                    dfs(cur - dungeons[i][1], dungeons, depth+1)
                }
                visited[i] = false
            }
        }
        max = max.coerceAtLeast(depth)
    }
}