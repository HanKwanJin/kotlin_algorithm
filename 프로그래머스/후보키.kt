class 후보키 {
    private val keyMap: MutableMap<String, MutableSet<String>> = mutableMapOf()
    fun solution(relation: Array<Array<String>>): Int {
        var answer = mutableListOf<String>()
        repeat(relation.size) { comb(relation,it, 0, "", "")}
        val candidates = keyMap.filter { it.value.size == relation.size }.toSortedMap(compareBy<String>{it.length}.thenBy { it })
        for (key in candidates.keys){
            val keyCount = key.length
            answer.add(key)
            for (candidate in answer){
                if (candidate.length >= keyCount) break
                else if (!isMinimal(key, candidate)){
                    answer.remove(key)
                    break
                }
            }
        }
        return answer.size
    }
    private fun comb(relation: Array<Array<String>>, n:Int, key:Int, keySet:String, tuple: String){
        if (key == relation[0].size && tuple.isNotEmpty()){
            val tuples = keyMap.getOrDefault(keySet, mutableSetOf())
            tuples.add(tuple)
            keyMap[keySet] = tuples
        }
        if (relation[0].size == key) return
        comb(relation, n, key+1, keySet+key, tuple+relation[n][key])
        comb(relation, n, key+1, keySet, tuple)
    }
    private fun isMinimal(key: String, candidate: String): Boolean{
        var count = 0
        for (c in candidate){
            if (key.contains(c)) count++
        }
        return count != candidate.length
    }
}