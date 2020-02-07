/*Inheritance is the process of acquiring the properties of one class into another class*/
/* superclass - Animal
*  subclass - Hippo
* */
/*
* use "open" key word to let the other classes extend this class*/
open class Animal{
    open var name = ""
    open var foodType = ""

    open fun makeNoise(){
        println("I'm Making noise")
    }

    fun roam(){
        println("I'm wandering")
    }

    fun display(){
        println("My name is ${name}")
        println("My Food Type is ${foodType}")
    }
}

/*In order to acquire the properties of another class we need to use ":" operator*/

open class Hippo:Animal()
{
    /*use override keyword to override any method in the superclass*/
    override fun makeNoise(){
        println("I'm making noise from Hippo class")
    }
}

fun main(){
    val hippo = Hippo()
    hippo.name = "I wont tell you"
    hippo.foodType = "Vegetarian"
    hippo.makeNoise()
    hippo.display()
}