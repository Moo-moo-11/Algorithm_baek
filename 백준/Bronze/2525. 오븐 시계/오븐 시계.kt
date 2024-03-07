fun main() {
    val ary = readln().split(" ")
    val a = readln().toInt()

    val h = ary[0].toInt()
    val m = ary[1].toInt()

    val a_h:Int = a / 60
    val a_m:Int = a % 60

    if (m + a_m < 60){
        if (h + a_h < 24){
            println("${h+a_h} ${m+a_m}")
        } else {
            println("${h+a_h-24} ${m+a_m}")
        }
    } else {
        if (h + a_h + 1 < 24) {
            println("${h+a_h+1} ${m+a_m-60}")
        } else {
            println("${h+a_h+1-24} ${m+a_m-60}")
        }
    }
}