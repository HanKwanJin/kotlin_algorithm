fun time(c: Char):Int = when(c){
    in 'A'..'C' -> 3
    in 'D'..'F' -> 4
    in 'G'..'I' -> 5
    in 'J'..'L' -> 6
    in 'M'..'O' -> 7
    in 'P'..'S' -> 8
    in 'T'..'V' -> 9
    else -> 10
}
fun main() = with(System.`in`.bufferedReader()){
    print(readLine().fold(0){sum, c -> sum + time(c)})
    this.close()
}