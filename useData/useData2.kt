// Any와 Any?

val anyVal1 : Any = 10
val anyVal2 : Any? = anyVal1 // Any 타입을 Any? 타입에 대입하면 문제가 없음.

val anyVal3 : Any? = 10
// val anyVal4: Any = anyVal3 - Any? 타입을 Any 타입에 대입할 때는 문제가 발생.
val anyVal5 : Any = anyVal3 as Any // as로 명시적 형변환이 필요하다.

// Unit, Nothing

fun fun1() { }
fun fun2() : Unit { } // fun1 == fun2, 반환 타입을 지정하지 않으면 Unit
// Unit을 반환 타입으로 설정하는 함수는 의미있는 반환값이 없다는 것을 의미

fun nothingFun(arg : Nothing?) : Nothing {
    throw Exception()
}
// Nothing은 의미 없는 데이터를 뜻하는 것을 명시적으로 선언하기 위해 사용하는 타입

// 타입 확인과 캐스팅(is)
fun getStringLength(obj : Any) : Int? { //  // 매개변수는 Any, 즉 String 이외의 다른 타입의 데이터도 전달이 가능
    // val strData : String = obj  - ERROR
    if(obj is String){
        return obj.length
    }
    return null
}

// !is : 특정 타입이 아닐 때 처리
fun getStringLength2(obj : Any) : Int? {
    if(obj !is String){
        return null
    }
    return obj.length
}

// 코틀린은 기초 데이터 타입에 대한 자동 형 변환 제공 X
val a1 : Int = 10
// val a2 : Double = a1 - Type Dismatch
val a3 : Double = a1.toDouble()
// toByte, toShort, toInt, toLong, toFloat, toDouble, toChar