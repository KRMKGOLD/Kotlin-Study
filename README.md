# learnKotlin
Android 언어 중 하나인 Kotlin 공부.

## 변수

1. useVar1.kt

   - 변수 선언, 초기화 방식 
2. useVar2.kt

   - nullable, const와 val의 차이 등

## 함수

1. useFunc1.kt

   - 함수 선언
   - 함수 오버로딩

> 오버로딩(overloading) : 같은 이름의 함수를 매개변수 부분을 다르게 하여 여러개 정의하는 기법
> 함수는 이름과 매개변수 둘 다 보고 판단하므로, 매개변수가 다르면 선언 중복 에러 발생X

2. useFunc2.kt

   - 기본 인수와 명명된 인수

   > 명명된 인수를 통해 인수를 전달하지 않는 경우, 명명된 인수를 사용한다.

3. useFunc3.kt

   - 중위 표현식

   > 중위 표현식(infix) : 피연산자의 식(A + B) 에서 연산자 역할을 하게 만들어주는 식. 

   - 가변 인수


## 데이터

1. useData1.kt

   - 기초 데이터 타입 - 1
     - 숫자, 문자, 논리, 문자열, Any

2. useData2.kt

   - 기초 데이터 타입 - 2

     ![](https://raw.githubusercontent.com/KRMKGOLD/learnKotlin/master/Image/AnyImage.png)

     - Any - Any?
       - Any에서 Any?는 가능하지만, Any?에서 Any는 불가능하다
       - Any?에 null값이 있을 가능성이 있어 Any에 대입이 불가
     - Unit, Nothing, is, casting with is

3. useData3.kt

   - 컬렉션 타입 1  : Array

4. useData4.kt

   - 컬렉션 타입 2 : List, Set, Map

