/*
* How to declare an interface
* - keyword interface
* - Interface can contain both NORMAL and ABSTRACT METHODS*/
fun main(){
    /*var p : PavanInterface = PavanInterface() -  An instance for an interface cannot be created*/
    var ui = UseInterface()
    ui.getDetails()
    ui.setDetails()
}

class UseInterface : PavanInterface,ApssdcInterface{
    override var name: String = "Pavan"
    override var age: Int = 16

    override fun setDetails() {
        println("We are now in SetDetails()")
    }

    override fun getDetails() {
        /*super.getDetails() - We are calling the PavanInterface's method getDetails*/
        /*If you have two interfaces that have the same method, we can explicitly specify which method should be called
        * in the following way.*/
        super<ApssdcInterface>.getDetails()
        println("We are now in UseInterface's getDetails() method")
    }

    override fun clickListener() {
        println("NO USE")
    }

}

interface PavanInterface{
    /*What ever you define in an interface - they, by default will be abstract*/
    var name:String
    var age:Int

    fun getDetails(){ //All the normal methods are public and open but NOT FINAL
       println("We are now in GetDetails")
    }

    fun setDetails() // In kotlin, unlike in java, we can have methods with body/implementations and methods that does
                    // not have implementation.
}

interface ApssdcInterface {
    fun getDetails(){
        println("We are now in APSSDC INTERFACE")
    }
    fun clickListener()
}