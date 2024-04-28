fun main(args: Array<String>) {
	val input = readLine()!!.split(' ')
    println(input[0].repeat(input[1]!!.toInt()))
}