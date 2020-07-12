//for循环
fun main(){

    //使用 .. 表示范围
    for(i in 1..10){
        //print("$i ")
    }//输出 1 2 3 4 5 6 7 8 9 10

    //使用until就不会包括最后面那个值
    for(i in 1 until 10){
        //print("$i ")
    }//输出1 2 3 4 5 6 7 8 9

    //使用step表示增量
    for(i in 1..10 step 2){
        //print("$i ")//输出 1 3 5 7 9
    }

    //倒序，这里也可以加上step
    for(i in 10 downTo 1){
        //print("$i ")
    }//输出10 9 8 7 6 5 4 3 2 1

    //对于数组
    val names = arrayOf("jack","rose","merry")
    //正常写法
    for(i in 0..names.size -1){
        //println(names[i])
    }
    //对于数组，有一个专门的遍历索引值的写法，即获取对应数组的索引值
    for(i in names.indices){
        //println(names[i])
    }
    //增强for写法(依次获取每一个元素）
    for(name in names){
        //println(name)
    }

    //特别的，对于数组，还可以同时取出索引值以及相对应的数值
    for((index,item) in names.withIndex()){
        println("$index - $item")
    }
    /*输出
    0 - jack
    1 - rose
    2 - merry
     */
    /*java中写法
     String[] names = new String[]{"1","2"};

    //for写法
    for (int i = 0; i < names.length - 1 ; i++) {
        System.out.print(names[i]);
    }

    //还可以使用增强for循环

     */
}