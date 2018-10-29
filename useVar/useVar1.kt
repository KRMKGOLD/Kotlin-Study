fun main(args : Array<String>){
    val data1 : Int = 30
    val data2 = 20 // : Int 없이, 타입 추론(30을 통하여 int형으로 추론함.)
    var data3 = 10

    // data2 = 10 - Error, val는 read-only variable 역할, var는 Mutable
    data3 = 100
}

// val topData1 : Int
// var topData2 : Int - 에러, 클래스 외부에서 선언했을 때에는 선언과 동시에 값을 초기화 시켜줘야 함.

class varClear{
    // val inObjData1 : Char
    var inObjData2 : Char = 'A'
    // 에러, 클래스 멤버 변수, 멤버 변수도 선언과 동시에 값을 초기화 해줘야 함.

    fun inFunc(){
        val inFuncData1 : Int
        var inFuncData2 : Int
        // 함수 내부 변수, 함수 내부 변수는 선언만 해도 가능

        // println(inFuncData1) - 에러, inFuncData1 변수는 값이 초기화되지 않음

        inFuncData2 = 10
        println(inFuncData2) // 10 출력
    }
}