/*
Mutable Collections:
        Mutable collections are collections with Write operations such as add and remove
Mutable List : is a list with list-specific operations - ex: add, remove.
        */

import java.util.Scanner

data class Students(val name:String,val id:Int)

fun main(){

    // How do we create a mutablelist
    val ml = mutableListOf<Students>(Students("Pavan",18),Students("Anusha",33))
    val s = Scanner(System.`in`)
    println("Enter How Many Number of objects of type Students you wanna enter: ")
    val n = s.nextInt()

    for(i in 1..n){
        println("Enter the name of the student: ")
        val sname = /*s.nextLine()*/ readLine()
        println("Enter the id of the student: ")
        val sid = s.nextInt()
        ml.add(Students(sname.toString(),sid))
    }

    for(i in ml){
        println("Name of the Student is ${i.name}")
        println("Id of the student is ${i.id}")
        println()
    }

    println("What is the index of the value that you want to delete?")
    val index = s.nextInt()

    ml.removeAt(index)

    println("After the removal - the values are as follows")
    for(i in ml){
        println("Name of the Student is ${i.name} and the id is ${i.id}")
        println()
    }
}