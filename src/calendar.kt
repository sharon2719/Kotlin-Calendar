//Creation of a Calendar
fun main(name:Array<String>){
    println("Enter your name: ")
    val name= readLine()
    println("Enter your age: ")
    var age:Int=Integer.valueOf(readLine())
    println("Your name is $name and your age is $age")

    calendar()
    schoolCalendar()

}
fun calendar(){
    println("Please enter month: ")
    var month= readLine()
    when (month?.toInt()){
        1-> println("January")
        2->println("February")
        3->println("March")
        4-> println("April")
        5-> println("May")
        6-> println("June")
        7-> println("July")
        8-> println("August")
        9-> println("September")
        10-> println("October")
        11-> println("November")
        12-> println("December")
        else-> println("Not a month of the year!")
    }
}
fun schoolCalendar(){
    println("Where are you in the school calendar?")
    var monthOfTheYear = readLine()
    when (monthOfTheYear?.toInt()){
        1,2,3,4-> println("You are in the first quarter of the school calendar.")
        5,6,7,8-> println("You are in the second quarter of the school calendar.")
        9,10,11-> println("You are in the third quarter of the school calendar.")
        12-> println("Holiday is here!")
        else-> println("Sorry not part of the school calendar.")
    }
    println("Have a nice term!")
}