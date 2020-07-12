public class test01 {
    public static void test() {
        int input = 0;

        switch(input){
            case 1:
                break;
            case 2:
                break;
        }
        String[] names = new String[]{"1","2"};

        //for写法
        for (int i = 0; i < names.length - 1 ; i++) {
            System.out.print(names[i]);
        }

        //还可以使用增强for循环

    }
}
