import java.awt.Color

fun main() {
    var name=names("joy","roy")
    println (name)

    var numeric= numbers(arrayOf(3,4,5))
    println(numeric)

   place("Nairobi")
    var car= cars(arrayOf("Volvo", "Mercedes", "Audi"))
    println(car)


    var calc=calcultor("black")
    calc.Addition(2,4)
    calc.subtraction(3,7)
    calc.divide(8.0,4.0)
    calc.multiply(9,10)




}
fun names(name1: String, name2:String): Char {
    var show = name1[0]
    return show
}
//2. Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements
fun numbers(nums:Array<Int>): Int{
    return nums.min()
    return nums.max()


}
//3. Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output. (3
fun place(city:String){

    for (c in city)
        println(c)
}
//4. Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.
fun cars(models:Array<String>): String {

    var newCar= models.contentToString()
    return newCar
}


class calcultor(var color: String){
    fun Addition(num1:Int, num2:Int) {
        var add= num1+num2
        println(add)
    }
    fun subtraction(num: Int, num2: Int){
        var sub= num- num2
        println(sub)
    }
    fun divide(num4: Double, num6: Double){
        var division= num4/num6
        println(division)

    }
    fun multiply(num5: Int, num7:Int){
        var multiple= num5*num7
        println(multiple)
    }
}