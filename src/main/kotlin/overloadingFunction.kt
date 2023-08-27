fun main() {
    var secondFunc: (num1: Int, num2: Int) -> Int =::add
    println(secondFunc(22,22));
}

fun add(num1:Int,num2:Int):Int{
    return num1+num2;
}