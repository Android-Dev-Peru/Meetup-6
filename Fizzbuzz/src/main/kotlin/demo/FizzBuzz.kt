package demo

/**
 * Created by eduardomedina on 7/09/16.
 */
class FizzBuzz {

    public fun  getResult(value:Int):String{
        if(value%15==0) return "fizzbuzz"
        else if (value%3==0) return "fizz"
        else if (value%5==0) return "buzz"

        return value.toString()
    }
}