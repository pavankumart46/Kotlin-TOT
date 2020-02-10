/*
What is singleton?
        - we have just one instance of a class in the whole application.
        - In Java we define singleton by using the keyword static.
        - In kotlin, we cannot use static keyword - There is an alternative
          - object - We can create a singleton class.
        - Init blocks can be written
        - object classes can have super classes
        - We cannot have constructors for object class
        */

open class People{
    var name:String = ""
    open fun display(){
        println("$name")
    }

    companion object Kumar{ // Companion objects are just like objects - But we can define an object inside of a class
        var details = ""
        fun me(){
            println("Hello")
        }
    }
}

object Student2/*(var des:String)*/: People(){  // Object classes can inherit properties from another class - But it cannot
    // have constructors.
    var id : Int = -1 // this variable behaves as a static variable.

    fun registerStudent(){  // this function also behaves as a static function.
        println("${id} Student registration complete")
    }

    override fun display() {
        super.display()
        println("You called the object class instance of Display() method")
    }
}

fun main(){
    Student2.id = 89
    Student2.registerStudent()

    Student2.id = 90
    Student2.registerStudent()
    Student2.name = "PAVAN"
    Student2.display()

    println(Student2.id)
    println(Student2.name)

    People.me()
}