// 함수 선언 : fun 함수명(매개변수명 : 타입) : 반환타입 { }

fun sum(a : Int, b : Int) : Int {
    // a = 10
    // 함수 선언 시, 매개변수 값은 val로 선언되어 값을 변환할 수 없음
    return a + b
}

/*
선언된 sum 함수는 매개변수의 값을 더해서 반환하는 한 줄로 구성되어 있음
중괄호를 생략하고 짧게 표현하는 것 : 단일 표현 함수
fun sum(a : Int, b : Int) = a + b
fun sum(a : Int, b : Int) : Int = a + b
*/

// 반환형이 Unit인 함수
/*
fun returnUnit(a : Int, b : Int) : Unit{ }
fun returnUnit(a : Int, b : Int){ }
*/

// 함수의 오버로딩(OverLoading)
// 같은 이름의 함수들의 매개 변수 부분을 다르게 함

fun OverLoading(a : String){ }
fun OverLoading(a : Int){ }
fun OverLoading(a : String, b : Int){ }
// 모두 같은 이름의 함수이지만, 매개변수 부분이 달라서 모두 다른 함수로 인식