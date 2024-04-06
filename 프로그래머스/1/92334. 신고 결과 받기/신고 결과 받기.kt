class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        val dupeRemoveReport = report.toMutableSet()
        val hashMap = HashMap <String,Int>()
        for (id in id_list) {
            hashMap[id] = 0
        }
        for (report in dupeRemoveReport) {
            hashMap[report.split(" ")[1]] = hashMap[report.split(" ")[1]]!!.plus(1)
        }
        val suspended = hashMap.filterValues{it>=k}.keys
        for (id in id_list) {
            hashMap[id] = 0
        }
        for (report in dupeRemoveReport) {
            if(report.split(" ")[1] in suspended) {
                hashMap[report.split(" ")[0]] = hashMap[report.split(" ")[0]]!!.plus(1)
            }
        }
        var answer = IntArray(id_list.size)
        for (id in id_list) {
            answer[id_list.indexOf(id)] = hashMap[id]!!
        }
        return answer
    }
}