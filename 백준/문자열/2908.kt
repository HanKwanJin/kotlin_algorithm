fun main() = with(System.`in`.bufferedReader()){
    print(readLine().split(" ").maxOfOrNull { it.reversed().toInt() })
}