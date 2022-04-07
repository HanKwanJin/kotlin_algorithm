import java.util.*

class 괄호회전하기 {
    fun solution(s: String): Int {
        var answer: Int = 0
        var str = s
        for (i in s.indices){
            if (isRight(str)) answer++
            str = str.substring(1, str.length) + str.substring(0,1)
        }

        return answer
    }
    private fun isRight(s: String): Boolean{
        var st: Stack<Char> = Stack()
        for (i in s.indices){
            if (s[i] == '(' || s[i] == '{' || s[i] == '['){
                st.push(s[i])
            }else{
                if (st.isNotEmpty()){
                    val c = st.pop()
                    if (c == '(' && s[i] == ')') continue
                    if (c == '{' && s[i] == '}') continue
                    if (c == '[' && s[i] == ']') continue
                    else return false
                }else{
                    return false
                }
            }
        }
        return st.isEmpty()
    }
}
fun main(){
    val func = 괄호회전하기()
    print( func.solution("[](){}"))
}