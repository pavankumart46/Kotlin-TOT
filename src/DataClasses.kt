data class Data(val name:String, val age:Int)
fun main(){
    var d1 : Data = Data("PAVAN",16)
    var d2 : Data = d1.copy()

    if(d1.equals(d2)){
        println("EQUAL")
    }else{
        println("NOT EQUAL")
    }

}
/*
* There is no need of implementing the body for a data class, however, if there is a need, we can do so
* - The Super class of all classes is called ANY
*   - Any Provides the following methods
*           - equals():Boolean
*           - hashcode():Int
*           - toString():String
* - The purpose of a data class is to just deal with Data
* - copy() method is available for Data Classes
* - In DataClasses Primary constructor parameters must have val/var declared*/
