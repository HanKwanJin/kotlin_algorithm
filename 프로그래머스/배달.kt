import java.util.*

class 배달 {
    data class Node(val idx: Int, val distance: Int):Comparable<Node>{
        override fun compareTo(other: Node): Int {
            return this.distance.compareTo(other.distance)
        }
    }
    fun solution(N: Int, road: Array<IntArray>, k: Int): Int {
        val town = IntArray(N+1){ INF }.apply { this[1] = 0 }
        val pq = PriorityQueue<Node>().apply { offer(Node(1,0)) }
        while (pq.isNotEmpty()){
            val now = pq.poll()
            if(now.distance > town[now.idx]) continue
            for (i in road.indices){
                if (road[i][0] == now.idx) {
                    val cost = now.distance + road[i][2]
                    val index = road[i][1]
                    if (cost < town[index]){
                        town[index] = cost
                        pq.offer(Node(index, cost))
                    }
                }else if (road[i][1] == now.idx){
                    val cost = now.distance + road[i][2]
                    val index = road[i][0]
                    if (cost < town[index]){
                        town[index] = cost
                        pq.offer(Node(index, cost))
                    }
                }
            }
        }
        return town.count { it <= k }
    }
    companion object{
        const val INF = 987654321
    }
}