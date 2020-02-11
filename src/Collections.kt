/*
Collections
        - A collection usually contains a number of objects of the same type
        - Objects in the collection are called as "elements " or "items"
        - Two Types of Collections
            - Read-Only collection
            - Mutable collection - We can add / remove objects in the collection.
        - "Collection" is an interface that acquires the properties of Iterable<T> - which is another interface.
        */

fun displayAll(s:Collection<String> /*List<String>*/){
    for(i in s){
        println(i)
    }
}

fun main(){
    val s = listOf<String>("PAVAN","Anusha","Krishna sir","Gopal","Sai","Chaitanya","Mastan") // to create a immutable list - use listOf() method
                            // - We cannot add / remove the values in the immutable list
    displayAll(s)

    val s2 = setOf<String>("One","Two","Three","Four","Two") // we can only store Unique elements in the set.
    // Duplicates are not allowed
    displayAll(s2)
}