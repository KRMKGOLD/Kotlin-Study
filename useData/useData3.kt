fun main(args: Array<String>) {
    arrayFunc()
}

fun arrayFunc(){
    val array1 = arrayOf(100, "String", 'A', true)
    // Kotlin���� �迭�� Array�� ǥ��

    println("${array1[0]}, ${array1[1]}")
    array1[0] = "array" // array1.set(0, "array")
    println("${array1[0]}")


    val array2 = arrayOf<Int>(10, 20, 30)
    // Ư�� Ÿ�Ը� �ִ� �迭�� ����� ���� ��, ���׸��� ����Ѵ�.
    // ���׸��� ������� �ʰ�, �����ϴ� xxxArrayOf�� ����� �� �ִ�.

    val xxxArray1 = intArrayOf(10, 20, 30)
    // intArrayOf, booleanArrayOf, byteArrayOf, charArrayOf, doubleArrayOf, floatArrayOf, longArrayOf, shortArrayOf...

    val nullArray = arrayOfNulls<Any>(5)
    // public fun <reified @PureReifiable T> arrayOfNulls(size: Int): Array<T?>
    // �μ��� array�� size - �迭�� ������ �� ũ�⸸ �����ϰ� �����ʹ� �������� �ʴ� �� ���·� �����ϴ� ���.
}
