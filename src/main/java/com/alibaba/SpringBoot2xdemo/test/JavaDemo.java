package com.alibaba.SpringBoot2xdemo.test;


class Person{
    String name;
    int age;
    public void tell(){
        System.out.println("姓名"+name+"、年龄"+age);
    }
}

public class JavaDemo {
    public static void main(String[] args) {
        Person per = new Person(); //声明并实例化对象
        per.name = "张三";
        per.age = 18;
        per.tell();

    }


}
