fun main() {
    println("Addition of two number is : ${addition(33,7)}");
    println("The Given Number is : ${evenOdd(14)}");
    println("==>>> ${tableNum(10)}");
}


fun addition(num1:Int,num2:Int):Int{

    return num1+num2;
}

fun evenOdd(num:Int):String{

    return  if(num % 2 ==0) "Even"  else "Odd";
}

fun tableNum(num:Int):Int{
    var number3:Int=0;
    for(i in 1..num){
        number3 =  i * num;

    }
    return number3;
}