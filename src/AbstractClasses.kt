/*
* Abstraction - Hiding the unnecessary details from the user*/

/*You cannot define any members in a class as abstract if your class is not abstract*/
fun main(){
    /*var g:Gopal = Gopal() - you cannot create an instance of an abstract class*/
    var gc = GopalChild()
    gc.business()
}
abstract class Gopal{
    abstract var name:String /*You cannot initialize an abstract property - Initialization should happen in the derived
                            classes*/
    var age:Int = 20

    fun marriage(){ // A function is by default final - if you want to override a function it has to be made open
        println("Gopal's marriage is a question")
    }

    abstract fun business() // All the abstract functions are open by default
}

class GopalChild : Gopal(){
    override var name: String = "Gopal"
    override fun business() {
        println("This is business")
    }
}
