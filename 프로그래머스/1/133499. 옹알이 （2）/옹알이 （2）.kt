class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        val babble = arrayOf<String>("aya", "ye", "woo", "ma")
        for (i in babbling) {
            var bab = i
            for (j in 0 until babble.size) {
                if (bab.contains(babble[j] + babble[j])) {
                // if (bab in (babble[j] + babble[j])) {
                continue
                } else {
                    bab = bab.replace(babble[j], " ")
                }
            }
            if (bab.replace(" ", "") == ""){
                answer++
        }
        }
        return answer
    }
}