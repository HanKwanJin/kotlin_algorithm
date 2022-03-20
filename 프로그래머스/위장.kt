class 위장 {
    fun solution(clothes: Array<Array<String>>): Int =
        clothes.groupBy { it[1] }.values.fold(1) { total, i -> total * (i.size + 1) }-1
}