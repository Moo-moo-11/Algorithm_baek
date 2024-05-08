class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        val maps = mutableMapOf<Int,Int>()

        maps[a] = maps.getOrDefault(a,0) + 1
        maps[b] = maps.getOrDefault(b,0) + 1
        maps[c] = maps.getOrDefault(c,0) + 1
        maps[d] = maps.getOrDefault(d,0) + 1

        when (maps.size) {
            4 -> return maps.minOf { it.key }
            3 -> { var answer = 1
                maps.filter { it.value == 1 }.keys.forEach { answer *= it }
                return answer
            }
            2 -> { if (maps[a] == 2) {
                if (a > b) {
                    return (a + b)*(a - b)
                } else if (b > a) {
                    return (a + b)*(b - a)
                } else if (a > c) {
                    return (a + c)*(a - c)
                } else if (c > a) {
                    return (a + c)*(c - a)
                }
            } else { if (maps[a] == 1) {
                return (10 * b + a)*(10 * b + a)
            } else if (maps[b] == 1) {
                return (10 * a + b)*(10 * a + b)
            } else if (maps[c] == 1) {
                return (10 * a + c)*(10 * a + c)
            } else {
                return (10 * a + d)*(10 * a + d)
            }
            }}
            1 -> return a * 1111
        }

        return 1
    }
}