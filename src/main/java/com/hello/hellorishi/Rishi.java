package com.hello.hellorishi;

public class Rishi {

    String name;
       int age;
       String res;
    public Rishi(String name, int age) {
        this.name = name;
        this.age = age;

        memeber(20,10);
        System.out.println("name:" + name + " age:" + age);
        System.out.println("name:" + name + " age:" + age);

    }

    String memeber(int a, int b) {
        int res = a + b;

        switch (res) {
            case 100:
                System.out.println("Rishi is a good boy");
                break;
                case 95:
                System.out.println("the tom is a good boy");
                break;
                default:
                    System.out.println("the tom is a bad boy");

        }
        System.out.println(a+b);
        return memeber(12,10);
    }

    public static void main(String[] args) {
        System.out.println("hello Rishi");
        Rishi rishi = new Rishi("Siva",18 );
        System.out.println(rishi);
        rishi.memeber(15,8);
    }
}