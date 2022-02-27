class 거리두기확인하기 {
    private val dir = arrayOf(Pair(1,0), Pair(-1,0), Pair(0,1), Pair(0,-1))
    private fun check(place: Array<String>, cy: Int, cx: Int): Boolean{
        //거리두기 잘 하고 있는지 확인한다. 잘 지켜지지 않으면 false 를 반환한다.
        for (i in 0..3){
            val nx = cx + dir[i].second
            val ny = cy + dir[i].first
            if (nx < 0 || ny < 0 || nx >= 5 || ny >= 5 || place[ny][nx] == 'X') continue
            if (place[ny][nx] == 'P'){
                return false
            }
            for (j in 0..3){
                val nnx = nx + dir[j].second
                val nny = ny + dir[j].first
                if (nny == cy && nnx == cx) continue
                if (nnx < 0 || nny < 0 || nnx >= 5 || nny >= 5 || place[nny][nnx] == 'X') continue
                if (place[nny][nnx] == 'P'){
                    return false
                }
            }
        }
        return true
    }

    fun solution(places: Array<Array<String>>): IntArray {
        var answer: IntArray = intArrayOf()

        places.forEach { place ->
            var ret = 1
            for (i in 0..4){
                for (j in 0 .. 4){
                    if (place[i][j] == 'P'){
                        if (!check(place, i,j)){
                            ret = 0
                            break
                        }
                    }
                }
                if (ret == 0) break
            }
            answer += ret
        }
        return answer
    }
}