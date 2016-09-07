package demo


fun main(args: Array<String>) {

    val fizzBuzz= FizzBuzz()

    println("1 "+fizzBuzz.getResult(1))
    println("5 "+fizzBuzz.getResult(5))
    println("9 "+fizzBuzz.getResult(3))
    println("15 "+fizzBuzz.getResult(15))
    println("30 "+fizzBuzz.getResult(30))
}
