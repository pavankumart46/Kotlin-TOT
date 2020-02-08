/*
* How to declare an interface
* - keyword interface*/
fun main(){
    /*var p : PavanInterface = PavanInterface() -  An instance for an interface cannot be created*/
    var ui = UseInterface()
    ui.getDetails()
    ui.setDetails()
}

class UseInterface : PavanInterface{
    override var name: String = "Pavan"
    override var age: Int = 16

    override fun setDetails() {
        println("We are now in SetDetails()")
    }

    override fun getDetails() {
        /*super.getDetails() - We are calling the PavanInterface's method getDetails*/
        super.getDetails()
        println("We are now in UseInterface's getDetails() method")
    }

}

interface PavanInterface{
    /*What ever you define in an interface - they, by default will be abstract*/
    var name:String
    var age:Int

    fun getDetails(){
       println("We are now in GetDetails")
    }

    fun setDetails() // In kotlin, unlike in java, we can have methods with body/implementations and methods that does
                    // not have implementation.
}
