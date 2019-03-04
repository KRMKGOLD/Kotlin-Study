fun main(args: Array<String>) {
    arrayFunc()
}

fun arrayFunc(){
    val array1 = arrayOf(100, "String", 'A', true)
    // Kotlin에서 배열은 Array로 표현

    println("${array1[0]}, ${array1[1]}")
    array1[0] = "array" // array1.set(0, "array")
    println("${array1[0]}")


    val array2 = arrayOf<Int>(10, 20, 30)
    // 특정 타입만 있는 배열을 만들고 싶을 때, 제네릭을 사용한다.
    // 제네릭을 사용하지 않고, 지원하는 xxxArrayOf를 사용할 수 있다.

    val xxxArray1 = intArrayOf(10, 20, 30)
    // intArrayOf, booleanArrayOf, byteArrayOf, charArrayOf, doubleArrayOf, floatArrayOf, longArrayOf, shortArrayOf...

    val nullArray = arrayOfNulls<Any>(5)
    // public fun <reified @PureReifiable T> arrayOfNulls(size: Int): Array<T?>
    // 인수는 array의 size - 배열을 정의할 때 크기만 정의하고 데이터는 대입하지 않는 빈 상태로 정의하는 방식.
}
