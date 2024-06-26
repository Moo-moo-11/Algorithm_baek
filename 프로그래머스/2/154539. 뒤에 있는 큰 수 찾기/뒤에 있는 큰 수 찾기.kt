class Solution {
    fun solution(numbers: IntArray): IntArray {
        val answer = IntArray(numbers.size) { -1 }

        val stack = ArrayDeque<Int>()

        for (i in numbers.indices.reversed()) {

            while (true) {
                if(stack.isEmpty() || numbers[i] < stack.last()) break

                stack.removeLast()
            }

            if(!stack.isEmpty()) answer[i] = stack.last()

            stack.add(numbers[i])
        }

        return answer
    }
}