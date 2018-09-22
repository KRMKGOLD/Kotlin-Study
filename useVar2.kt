// val notNullVal : String = null
val nullVal1 : String? = null
var nullVal2 : String? = null
// Kotlin에서는 변수에 null값을 대입할 때 nullable 변수로 선언해주어야 함.(null safety)
// null 값을 대입하기 위해선 변수 타입에 '?' 기호를 이용

fun nullMain(){
    // nullVal1 = "Hello"
    nullVal2 = "Hello"
    // nullVal1은 val로 선언했기 때문에 값을 바꿀 수 없다.
}

// const 함수 관련
// 변수를 선언할 때 val로 사용하면 상수변수인 것일까?
var boolData : Boolean = false
val valData : String = "Hello"
    get() {
        if(boolData) return field
        else return field.toUpperCase()
    }

fun valMain(args : Array<String>){
    println(valData)
    boolData = true
    println(valData)
    // get()을 통해서 val 형식의 변수의 출력값을 바꿀수는 있다.
}

const val myConst1: Int = 10
// const var myConst2 : Int = 10

/*
fun constFun(){
    const val inFunConst : Int = 10
}

class constClass{
    const val inClassConst : Int = 10
}
*/
// const 예약어는 var 변수에 사용할 수 없고, 최상위에만 선언이 가능하므로 함수, 클래스 내에는 사용이 불가능하다(object class 제외)