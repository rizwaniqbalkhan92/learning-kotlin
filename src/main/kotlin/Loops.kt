fun main() {

//    while loop
     var number=2;
    var index=1;
    while (index<=100){
//        println("2 X "+index+" = "+number*index);
        index++;
    }

    // for loop
    for (i in 1..10 step 2)
    {
//        println("INDEX IS : "+i);
    }
// for 10 table

    for (i in 1 until 21){
//        println(" 10 X "+i+" = "+i * 10);

    }

    //  table 3 decreasing order reverse
    var number2=3;
    for(i in 10 downTo 1 step 3){
//        println("==>> 3 X "+i+" = "+i * 3);
    println("$number2 X $i = ${number2 * i}")
    }


}