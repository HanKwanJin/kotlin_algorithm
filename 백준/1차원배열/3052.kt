fun main() = with(System.`in`.bufferedReader()){
    var set = mutableSetOf<Int>()
    repeat(10){
        val num = readLine().toInt()
        set.add(num % 42)
    }
    print(set.size)
}