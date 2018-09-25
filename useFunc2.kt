// 기본 인수와 명명된 인수

fun para(name : String) { // para 변수에서의 String형 매개변수 선언
    println("Hello $name")
}

fun paraMain(){
    para("Kotlin")
    // para 함수의 인자(argument) 전달
}

/*
만약, main 함수 내 호출자가 인수를 명시하지 않는 경우에는?
피호출자(para)가 알아서 기본값을 명명할 수 있음 - 기본 인수
*/

fun nullPara(name: String?){
    if(name == null){
        println("Hello, World!")
    }
    else{
        println("Hello, $name!")
    }
}

fun nullParaMain(){
    nullPara(null)
    nullPara("Kotlin")
}

/*
기본 인수를 사용하지 않으면 귀찮은 상황 발생
1. nullPara()의 매개변수가 nullable 변수로 선언해줌 ex) name : String?
2. if-else 구문이 들어가야 함
*/

fun nullCheckPara(name : String = "World"){
    println("Hello, $name!")
}
fun nullCheckParaMain(){
    nullCheckPara() // 기본값 지정, Hello, World! 출력
    nullCheckPara("Kotlin")
}

fun namingArgu(name : String = "World", no : Int){
    println("Hello, $name, $no")
}

fun main(args : Array<String>){
    // namingArgu(10) - 10을 넣어주면 String형도 아니고, 자동으로 Int형으로 받아주지도 못함.
    namingArgu("Kotlin", 10) // Hello, Kotlin, 10 출력
    namingArgu(no = 20) // no라는 변수에 10을 직접 대입해서 호출,
    namingArgu(no = 30, name = "Android")
}