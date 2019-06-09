package com.neuedu.test.Test0606.GetVehicle;

public class Aircraft extends Vehicle {
    public void Howwork(String a) {
        this.setWork(a);
        System.out.println("飞机的工作方式为：" + getWork());
    }

    public void HMseat(int b) {
        this.setSeat(b);
        System.out.println("飞机能坐的人数为：" + getSeat());
    }

    public void HMspeed(double c) {
        this.setSpeed(c);
        System.out.println("飞机的速度为：" + getSpeed());
    }
}
