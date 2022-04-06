class 순위검색 {
    fun solution(info: Array<String>, query: Array<String>): IntArray {
        var answer: IntArray = IntArray(query.size) {0}
        var wordMap:MutableMap<String, Int> = SettingWordMap()
        var scoreList: MutableList<MutableList<Int>> = MutableList<MutableList<Int>>(4 * 3 * 3 * 3) { mutableListOf() }
        val infoRegex = " ".toRegex()
        val queryRegex = "( and )|( )".toRegex()
        info.forEach {
            val (infoList, score) = SplitInfo(it, infoRegex)
            val arr: IntArray = intArrayOf(
                wordMap[infoList[0]]!! * 3 * 3 * 3,
                wordMap[infoList[1]]!! * 3 * 3,
                wordMap[infoList[2]]!! * 3,
                wordMap[infoList[3]]!!
            )
            for (i in 0 until (1 shl 4)){
                var index: Int = 0
                for (j in 0 until 4){
                    if (i and (1 shl j) != 0) {
                        index += arr[j]
                    }
                }
                scoreList[index] += score
            }
        }
        scoreList.forEach {
            it.sort()
        }
        for (i in query.indices){
            val (queryInfo, score) = SplitInfo(query[i], queryRegex)
            val index: Int = (
                        wordMap[queryInfo[0]]!! * 3 * 3 * 3 +
                        wordMap[queryInfo[1]]!! * 3 * 3 +
                        wordMap[queryInfo[2]]!! * 3 +
                        wordMap[queryInfo[3]]!!
                    )
            var ret: Int =  scoreList[index].binarySearch(score)
            if (ret < 0){
                ret = (ret + 1) * -1
            }else if(ret > 0){
                for (j in ret downTo 0){
                    if (scoreList[index][j] == score){
                        ret = j
                    }else{
                        break
                    }
                }
            }
            answer[i] += scoreList[index].size - ret
        }

        return answer
    }
    fun SettingWordMap():MutableMap<String, Int>{
        var wordMap: MutableMap<String, Int> = HashMap<String, Int>()
        wordMap["-"] = 0
        wordMap["cpp"] = 1
        wordMap["java"] = 2
        wordMap["python"] = 3
        wordMap["backend"] = 1
        wordMap["frontend"] = 2
        wordMap["junior"] = 1
        wordMap["senior"] = 2
        wordMap["chicken"] = 1
        wordMap["pizza"] = 2
        return wordMap
    }

    fun SplitInfo(info: String, regex: Regex): Pair<List<String>, Int> {
        var infoList: List<String> = info.split(regex)
        val score = infoList[4].toInt()
        return Pair(infoList.subList(0,4), score)
    }

}