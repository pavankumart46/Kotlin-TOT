fun main(){
    /*let us allow the computer to choose one option from the three options randomly*/
    val options = arrayOf("Rock","Paper","Scissor")
    val computer_choice = computerChoice(options)
    /*Lets Get the User Selection*/
    val user_choice = userChoice(options)
    /*Decide who won!*/
    whoIsTheWinner(computer_choice,user_choice,options)
}

fun computerChoice(options:Array<String>):String{
    val com_index = (Math.random()*(options.size)).toInt()
    return options[com_index]
}

fun userChoice(options:Array<String>):String{
    println("Please Choose an option from the following\n1.Rock\n2.Paper\n3.Scissor")
    val choice = Integer.valueOf(readLine())
    var user_choice = ""
    when(choice){
        1-> user_choice = options[choice-1]
        2-> user_choice = options[choice-1]
        3->user_choice = options[choice-1]
        else-> println("The option that you entered is not present!")
    }
    return user_choice
}

fun whoIsTheWinner(computer_choice:String,user_choice:String,options:Array<String>){
    if(computer_choice.equals(user_choice))
        println("Computer selected ${computer_choice} and you selected ${user_choice} - Draw!")
    else if((computer_choice.equals(options[0]) && user_choice.equals(options[1]))
        || (computer_choice.equals(options[1]) && user_choice.equals(options[2]))
        || (computer_choice.equals(options[2]) && user_choice.equals(options[0])))
        println("Computer selected ${computer_choice} and you selected ${user_choice} - You win!")
    else
        println("Computer selected ${computer_choice} and you selected ${user_choice} - You loose!")
}