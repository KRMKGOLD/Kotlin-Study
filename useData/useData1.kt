// 1. 숫자타입

val intData : Int = 10
// 기본 : int형

// int, double형 등은 모두 클래스이며, 클래스로 타입을 명시하여 선언한 변수는 그 자체로 객체이다.
val useIntData = intData.div(2)
// Int, Double, Float, Long, Short, Byte, Char, Boolean, String, Unit, Nothing 타입 제공

// 문자는 Number Type이 아니기 때문에, 자동 형변형을 제공하지 않는다.

// 숫자 타입에 언더바를 추가할 수 있다.
// 출력은 그대로 1000000으로 출력됨.
val million = 1_000_000

// 논리, 문자, 문자열(boolean, char, String)

val isTrue1 : Boolean = true && false // false
val isTrue2 : Boolean = true || false // true
val isTrue3 : Boolean = !true

val charData = 'A'
val str : String = "hello"

// fun main(args: Array<String>) {
//     println("str[1] : ${str[1]}")
// }

// String은 두 중료의 string literals를 가지고 있음.

val str1 : String = "Hello\nWorld!" // escaped string
val str2 : String = """Hello
World
""" // raw string

// Any 타입
// 코틀린 클래스의 최상위 타입.

fun getLength(obj : Any) : Int? {
    if(obj is String)
        return obj.length
    return null
}

fun anyMain(args: Array<String>) {
    println(getLength("Hello")) // 5(Hello -> length)
    println(getLength(10)) // null
}

// null 허용 타입
// val nullA : Int = null - error
val nullA : Int? = null // Ok