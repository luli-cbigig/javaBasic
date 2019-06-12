package com.neuedu.test.Test0606.EveningParty;

public class Girl extends Students implements Host{
    @Override
    public void start() {
        System.out.println("女士们，先生们，大家好，我是主持人...");
    }

    @Override
    public void eat() {
        System.out.println("我是女同学，我嗑瓜子，吃水果...");
    }
}
