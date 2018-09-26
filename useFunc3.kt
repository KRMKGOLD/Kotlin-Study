/*
    중위 표현식(infix) : 연산자를 이용할 때 많이 사용되는 개념으로, 연산자를 피연산자의 중간에 놓는 개념.
    ex) a + b에서 a와 b라는 피연산자 사이에 ' + '라는 연산자를 놓았을 때, '중위 표현식을 사용했다' 라고 표현

    중위 표현식을 함수 호출 시에도 사용할 수 있다.
*/

infix fun Int.plusFun(x : Int) : Int{
    return x + x
}
// infix는 한 개의 파라미터만을 가지고 있어야 한다.

class funClass{
    infix fun infixFun(a : Int){
        println("call infixFun...")
    }
}

/*
    infixFun은 funClass의 멤버 함수이기 때문에, 함수 내에서 객체로 생성한 후 `객체명.함수명(인자값)` 식으로 선언
    infix로 중위 표현식을 선언할 시, 함수명을 연산자처럼 사용할 수 있다, 즉 `객체명 함수명 인자값` 이렇게 사용 가능
*/

fun infixMain(args : Array<String>){
    val obj = funClass();
    obj.infixFun(10)
    obj infixFun 10
    // 기본적인 객체 선언 방법과, 중위 표현식으로 선언한 방식

    println(10.plusFun(10))
    println(10 plusFun 10)
    // plusFun 함수는 Int class의 확장 함수로 선언하였음.
}

// 중위 표현식은 클래스 멤버 함수(funClass.infixFun)이거나, 확장 함수(Int.plusFun)일 때만 사용이 가능하다.