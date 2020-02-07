/*
Visibility Modifiers in Kotlin
        - public - All the classes and functions in Kotlin are public by default
        - protected - All the functions,properties in a class can only be accessed in a derived/sub class
        - private - All the functions, properties are private.
        - internal - All the functions, properties are available across the module.*/
open class Pavan{ // by default the class is public and final
    public var name:String = "" // by default the properties of a class are public
    protected var age:Int = 0
    private var gender:Char = 'M'
    internal var weight:Double = 12.2

    open fun display(){
        println("Name is ${name}")
        println("Age is ${age}")
        println("Gender is ${gender}")
        println("Weight is ${weight}")
    }
}

class PavansChild(a:Int):Pavan(){
    init {
        age = a
    }
    override fun display() {
        /*super.display() - With this the parent class display() method will be called*/
        println("Name is ${name}") /*In the derived class or sub class all the public properties of the super class can
        be called*/
        println("age is ${age}") /*In the derived class or sub class all the protected members of the super class can
        be called*/
        /*println("Gender is ${gender}") In the derived class or sub class all the private members of the super class can
        not be called*/
        println("Weight is ${weight}") /*In the derived class or sub class all the internal members of the super class can
        be called*/
    }
}

class Android{

    fun print() {
        var p:Pavan = Pavan()
        p.name = "PAVAN KUMAR"
        /*p.age = 23 - as age is protected and we are on a separate class - it cannot be accessed*/
        /*p.gender = 'M'- as gender is private and we are on a separate class - it cannot be accessed*/
        p.weight = 34.5 /*As weight is internal, we can access the weight variable from anywhere in the module*/
    }

}

fun main(){
    var p:PavansChild = PavansChild(18)
    p.name = "PAVAN"
    /*p.age = 18* private - not accessible*/
    p.weight = 60.4
    /*p.age = 23 - by creating the object instance for a derived class protected members of the class cannot be called*/
    p.display()

    var p2 : Pavan = PavansChild(16)
    p2.display()
    /*Will the pavan class display() method gets executed or PavansChild class display method ?*/
}
