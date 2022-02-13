fun solution(new_id: String) = new_id.lowercase()
        .filter { it.isLowerCase() || it.isDigit() || it == '-' || it == '_' || it == '.'}
        .replace("[.]+".toRegex(), ".")
        .removePrefix(".")
        .removeSuffix(".")
        .let { it.ifEmpty { "a" }}
        .let { if(it.length > 15) it.substring(0 until 15) else it }.removeSuffix(".")
        .let {
            if(it.length <= 2){
                StringBuilder(it).run {
                    while (length < 3) append(it.last())
                    toString()
                }
            }else it
        }

fun main(){
    println(solution("...!@BaT#*..y.abcdefghijklm"))
}