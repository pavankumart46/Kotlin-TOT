import java.util.Scanner
fun main(){
    println("What would like to do?\n1. To convert temp from celcius to farenheit \n2. To convert temp from farenheit to celcius")
    val sc = Scanner(System.`in`)
    val selection = sc.nextInt()
    /*The following code looks works similar to Switch Case Default*/
    when(selection){
        1->{
            println("Enter temperature in Celcius")
            convertToFarenheit(sc.nextFloat())
        }

        2->{
            println("Enter temperature in Farenheit")
            convertToCelcius(sc.nextFloat())
        }
        else->{
            println("The Option is wrong! retry!")
        }
    }

}

/*Convert the temp from celcius to farenheit*/
fun convertToFarenheit(number:Float){
   val f = (number)*1.8 + 32
    println("The farenheit temp is ${f}")
}

/*Convert the temp from fareheit to celcius*/
fun convertToCelcius(number:Float){
   val c = ((number - 32)*5)/9
    println("The celcius temp is ${c}")
}