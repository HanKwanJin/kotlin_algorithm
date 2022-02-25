import java.util.*

class 괄호변환 {
    private fun isRight(w : String): Boolean{
        val stack = Stack<Char>()
        for (i in 0 until w.length){
            if (w[i] == '('){
                stack.add('(')
            }else{
                if (stack.isEmpty()){
                    return false
                }else{
                    stack.pop()
                }
            }
        }
        return true
    }
    fun solution(p: String): String {
        var answer = ""
        var u = ""
        var v = ""
        var open = 0
        var close = 0
        if (p.isEmpty()) return answer
        for (i in 0 until p.length){
            u += p[i]
            if (p[i] == '('){
                open++
            }else if (p[i] == ')'){
                close++
            }
            if (open == close){
                v = p.substring(i+1, p.length)
                break
            }
        }
        if (isRight(u)){
            answer += u
            answer += solution(v)
        }else{
            var temp ="("+solution(v)+")"
            var removeU = u.substring(1,u.length-1)
            for(ch in removeU){
                if(ch=='('){
                    temp+=')'
                }
                else{
                    temp+='('
                }
            }
            answer+=temp
        }
        return answer
    }
}
fun main(){
    val f = 괄호변환()

    print(f.solution("()))((()"))
}