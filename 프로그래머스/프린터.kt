import java.util.*

class 프린터 {
    fun solution(priorities: IntArray, location: Int): Int {
        var queue = ArrayDeque<Pair<Int,Int>>()
        priorities.forEachIndexed { index, i ->
            queue.offer(Pair(index,i))
        }
        var cnt = 0
        while (!queue.isEmpty()){
            var head = queue.poll()
            if (queue.filter { head.second < it.second }.isNotEmpty()){
                queue.offer(head)
            }else{
                cnt++
                if (head.first == location) break
            }
        }
        return cnt
    }
}