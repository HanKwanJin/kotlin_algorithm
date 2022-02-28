import kotlin.math.abs

class 수식최대화 {
    fun solution(expression: String): Long {
        var answer: Long = 0
        val priority  =  arrayOf(
            arrayOf('+', '-', '*'),
            arrayOf('+', '*', '-'),
            arrayOf('-', '+', '*'),
            arrayOf('-', '*', '+'),
            arrayOf('*', '+', '-'),
            arrayOf('*', '-', '+')
        )

        for (case in priority){
            case.forEach { print("$it ") }
            println()
            answer = dfs(expression, 0, case).let {
                if (abs(it) > answer) {
                    abs(it)
                }else{
                    answer
                }
            }

        }
        return answer
    }
    fun dfs(expression: String, depth: Int, case: Array<Char>): Long{
        if (expression.toLongOrNull() != null) return expression.toLong()
        val tokens = expression.split(case[depth])
        var ret: Long ?= null
        for (token in tokens){
            val value = dfs(token, depth+1, case)
            ret = if (ret == null) {
                value
            }else {
                calc(ret, value, case[depth])
            }
        }
        return ret!!
    }
    fun calc(num1: Long, num2: Long, op: Char): Long{
        return when(op){
            '*' -> {num1 * num2}
            '+' -> {num1 + num2}
            else -> {num1 - num2}
        }
    }
}