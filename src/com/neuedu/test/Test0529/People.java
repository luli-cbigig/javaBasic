package com.neuedu.test.Test0529;

public class People extends Monkey{
    public People(String s){
        super(s);
    }

    @Override
    public void speak() {
        System.out.println("小样的，不错嘛！会说话了！");
    }

    void think(){
        System.out.println("别说话！认真思考！");
    }
}
