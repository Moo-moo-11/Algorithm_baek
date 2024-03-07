fun main() {
    val x = readln().toInt()
    val y = readln().toInt()

    if (x>0) {
        if (y>0){
            println("1")
        } else if (y<0) {
            println("4")
        }
    } else if (x<0) {
        if (y<0) {
            println("3")
        } else if (y>0){
            println("2")
        }
    }
}