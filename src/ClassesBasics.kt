/*Before you create a class - you have to have two things in hand
* - Attributes - Properties
* - Functions - Behaviour*/

class Dog(val name:String,var age:Int,val sex:Char){
    /*Initializer blocks gets executed immediately after the object creation but only after
    * Constructor call
    * To define initializer blocks we use the keyword 'init'
    * if Your class has multiple init blocks - they get executed in the order that
    * they appear
    * The init blocks in the class are called implicitly after the object is created. */
    init {
        println("This statement gets executed after the execution of constructor")
    }
    fun swagTail(){
        println("${name} is swagging the tail")
    }
    fun swim(){
        println("${name} is swmming.")
    }
    init {
        println("This is the second init block of Dog Class")
    }
}

fun main(){
    /*How do we create an Object*/
    val dog = Dog("Tommy",10,'F')
    dog.swagTail()
    dog.swim()

    val dog2 = Dog("Candy",11,'M')
    dog2.swagTail()
    /*val dog :Dog = Dog()*/

    dog.age = 12
}