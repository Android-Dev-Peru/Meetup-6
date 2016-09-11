/**
 *
 */
package pe.androiddev.kata

import org.junit.Test
import java.util.*

/**
 * @author Carlos Piñan
 * @date 9/10/16
 */

class NumbersKata {

    @Test
    fun evenNumbers() {
        voidFunction()
        val array = get()
        println(array)
        println(array.filter { it % 2 == 0 })
    }

    @Test
    fun oddNumbers() {
        val array = getArray()
        println(array)
        println(array.filter { it % 2 != 0 })
    }

    @Test
    fun divisibleBy5() {
        val array = getArray()
        println(array)
        println(array.filter { it % 5 == 0 })
    }

    @Test
    fun sumAllNumbers() {
        var sum1 = 0
        var sum2 = 0
        var array = get()
        for(n1 in array) {
            sum1 += n1
        }
        for(n2 in array.indices) {
            sum2 += array[n2]
        }
        println(sum1)
        println(sum2)
        assert(sum1 == sum2)
    }

    @Test
    fun checkNumbers() {
        assert(couldBeNumber(5) is Int)
        assert(couldBeNumber(2) == 2)
        assert(couldBeNumber("asdasdasd") == null)
    }

    fun getArray() : ArrayList<Int> {
        return arrayListOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16)
    }

    fun get() : ArrayList<Int> = arrayListOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16)

    fun voidFunction() : Unit {
        println("This is a void function")
    }

    fun couldBeNumber(value: Any) : Int? {
        if(value is Int)
            return value
        return null
    }

}