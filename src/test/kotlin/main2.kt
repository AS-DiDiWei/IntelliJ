/*//条件语句
fun main(){
    var num = 20

    //正常操作
    if(num >20){

    }else{

    }

    //kotlin里面 if-else是一个表达式，也就是说它是有结果的
    val result = if(num > 10) "下载成功" else "下载失败"//这里的结果就是String类型

    //这样的话就没有返回值
    val res = if(num > 10){
        println("$num > 10")
    }else{
        println("$num < 10")
    }

    //这样的话它的类型就可以是 {Comparable{Int & String}
    val res1 = if(num > 10){
        println("$num > 10")
        20
    }else{
        println("$num < 10")
        "失败"
    }
    //上面的代码体现了kotlin条件语句的第一个好处：简洁
    //第二个特点就是 可以利用kotlin的类型推断，省略很多变量的定义，直接用一个变量var result来接收就可以
    //如果没有这个，那就要 一个结果定义一个变量来接收
    //比如
    val temp:Int
    val name:String
    if(1 > 0){
        temp = 20
    }else{
        name = "111"
    }
    //这里是只有两个，如果是多个，那就要定义多个变量，但是kotlin这里不用，上面代码可以改为
    var result1 = if(1 > 0) 20 else "111"

    //kotlin里面第二个判断语句
    //在c语言里面，有一个问号表达式，即 2 > 1 ? a:b
    //在kotlin里面有一个判空表达式，即 a ?: b 如果a不为空，那么结果就是a，如果a为空，那么结果就是b
    var Myname = "大帅哥"
    var result2 = Myname ?: "Myname为空"
    println(result2)//此时输出 大帅哥
    //
    var MynameSecond = null
    var result2Second = MynameSecond ?: "Myname为空"
    println(result2Second)//此时输出 Myname为空
}*/