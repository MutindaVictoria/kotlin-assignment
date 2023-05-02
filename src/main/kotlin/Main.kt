fun main() {
personalDetails("Brenda",19,"Russia")
println(totalAddition(20,20,10,5))
println(averageNumbers(10.0,10.0,5.0,5.0,10.0))
var fullName: String = "Victoria"
var age: Byte = 22
var phoneNumber: Int = 748914372
var weightInkg: Float = 57.9F
var citizen: Boolean = true
println(fullName)
println(age)
println(phoneNumber)
println(weightInkg)
println(citizen)
}
//1. Create and invoke a function that takes in a users name, age,
// and nationality and prints out “Hello my name is ${name}, I am ${age}
// and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out “Hello my name is Lucy,
// I am 23 years old and I am from Kenya”
fun personalDetails(name:String,age:Int,nationality:String){
    println("Hello my is $name ,I am $age years old and I am from $nationality")
}
//2. Create and invoke a function that returns the sum of any given 4 numbers (3 points)
fun totalAddition(num1:Int,num2:Int,num3:Int,num4:Int):Int{
    var addition=num1+num2+num3+num4
    return addition
}
//3. Create and invoke a function that given any 5 numbers, it returns their average (2 points)
fun averageNumbers(num1:Double,num2:Double,num3:Double,num4:Double,num5:Double):Double{
    var average=(num1+num2+num3+num4+num5)/5
    return average
}
//You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not. (3 points)
