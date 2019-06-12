package com.neuedu.test;

public class TestTwo {
//    public static void main(String[] args) {
//        int a=465;
//        int b=0;
//        while(a != 0){
//            b=a%10;
//            System.out.print(b);
//            //第一次执行b=5，a=46
//            //第二次执行b=6，a=4
//            //第三次执行b=4，a=0 循环结束
//            a=a/10;
//        }
//    }
//    public static void main(String args[])
//    {
//        String str=new String("hello");
//        if(str=="hello")
//        {
//            System.out.println("true");
//        }
//        else     {
//            System.out.println("false");
//        }
//    }
//    static boolean Paddy;
//    public static void main(String args[]){
//        System.out.println(Paddy);
//    }

}
//    class Example {
//        String str = new String("good");
//        char[] ch = {'a', 'b', 'c'};
//
//        public static void main(String args[]) {
//            Example ex = new Example();
//            ex.change(ex.str, ex.ch);
//            System.out.print(ex.str + " and ");
//            System.out.print(ex.ch);
//        }
//
//        public void change(String str, char ch[]) {
//            str = "test ok";
//            ch[0] = 'g';
//        }
//   }
class B2{
public static B2 t1 = new B2();
public static B2 t2 = new B2();
        {
        System.out.println("构造块");
        }
static
		{
                System.out.println("静态块");
                }
public static void main(String[] args)
        {
        B2 t = new B2();
        }
}
