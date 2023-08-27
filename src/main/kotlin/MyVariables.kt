fun main() {
    print("helloooooo")
    var num=11;
    print("this is number"+num);
    num=12;
    print("this is number"+num);
    val num2=11;
    print("this is number"+num2);
//    num2=12;
//    print("this is number"+num2);
var score:Int = 10;
    var temp:Double=11.2;
    var isCity:Boolean=true;
    var startChar:Char='K';
    var city:String="karachi"
    println(score);

    var check=score in 1..11
    var ceheck2=score  in 1 until 11;
    var animal="Cat";

    when(animal){
        "Horse"-> println("Animal is Horse");
        "Cat"-> println("ANimal is Cat");
        else -> println("ANimal is not found");

    }
var number:Int=11;
var res=when(number){
  11 ->  "Eleven"
  12->     "Twelve"
   13->"thirteen"
    else -> "Not in Range"

}

    println(res)

}