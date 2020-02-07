class Student(var name:String){
    var id:Int = -1
    var age:Int = 10
    var weight:Double = 2.3
    fun display(){
        println("the name is ${name} and the id is ${id} and the age is ${age}")
    }
    /*How to create a secondary constructor*/
    constructor(name:String,id:Int):this(name){
       this.id = id
    }
    constructor(name:String,age:Int,weight:Double):this(name){
        this.age = age
        this.weight = weight
    }
    init{
        println("init block is executed")
    }

    /*The body of the secondary constructor is called after the execution of init block*/
    /*Priority is as follows
    * - The primary Constructor
    * - Init blocks
    * - The secondary constructors*/
}
fun main(){
    var s = Student("Pavan",20,45.8)
    s.display()
}