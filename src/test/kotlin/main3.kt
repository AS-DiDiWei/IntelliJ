/*fun main(){
    //首先复习一下switch语句
    /*int input = 0;

    switch(input){
        case 1:
        break;
        case 2:
        break;
    }*/
    //kotlin用when语句代替了switch语句，并且增强了它的功能

    //kotlin中的when语句更简洁
    var score:Int = 10
    when(score){
        10 -> println("10")
        20 -> println("20")
        30 -> println("30")
        40 -> println("40")
        else -> println("其他")//类似于default
    }//这里输出10

    //kotlin中的when语句更灵活
    var score1:Int = 10
    when(score1){
        in 1..60 -> println("考的太差")
        in 60..79 ->println("考的不太好")
        in 80..89 ->println("考的还行")
        in 90..100->println("考的不错")
        else -> println("没来考试？")
    }//这里输出 考的太差

    //kotlin中的when语句更方便,这里when也可以作为表达式
    var score2:Int = 10
    var result = when(score2){
        10 -> 'A'
        20 -> 'B'
        30 -> 'C'
        else -> "emmm"
    }
    println(result)//这里输出A
}*/