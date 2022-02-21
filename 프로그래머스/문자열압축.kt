import kotlin.math.min

class 문자열압축 {
    fun solution(s: String): Int {
        var ret = s.length
        if (s.length == 1) return 1
        for (i in 1..s.length / 2){
            var str = s.substring(0,i)
            var len = i //비교 길이
            var isSame = 1
            var remain = 0
            for (j in i .. s.length - i step i){
                remain = s.length - j - i
                if (str == s.substring(j, j+i)){
                    isSame++
                }
                else {
                    if (isSame > 1){
                        len += isSame.toString().length
                    }
                    isSame = 1
                    len += i
                    str = s.substring(j, j+i)
                }
            }
            if (isSame >  1){
                len += isSame.toString().length
            }
            ret = min(ret, len+remain)
        }
        return ret
    }
}