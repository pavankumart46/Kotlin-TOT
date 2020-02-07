/*this syntax applies to Kotlin 1.3*/
/*Agenda:  to check which number is greater between any two given numbers*/
/*fun main(){
    val x:Int = 20
    val y = 30
    *//* <,>,<=,>=,==,!= *//*
    *//*if(x>y)
        println("X is greater than y")
    else
        println("Y is greater than x")*//*
    if(x>y) println("X is greater than y") else println("Y is greater than x")
}*/
/*This syntax applies to all the versions below 1.3*/
/*
fun main(args:Array<String>){

}*/

/*
* TO Explicitly convert a data type of one kind into another kind,
* We use the following methods
* -toInt()
* -toLong()
* -toShort()
* -toByte()
* -toFloat()
* -toDouble()
* -toString()
* -toChar()
* */
fun main(){
    val x: Int = 12
    val y:Int = 13
    val z:Int = 14
    /*Find out the biggger one among the three*/
    if(x>y && x>z) println("${x} is bigger")
    else if(y>x && y>z) println("${y} is bigger")
    else if(z>x && z>y) println("${z} is bigger")
}





