package com.test.first;

public class TestOne {
    public static void main(String[] str) {
        new TestOne();
    }

    public TestOne(){
        callM();
    }

    public void callM(){
        sop("print!");
        sopl("");
        sopl("printing!!!!T");
    }

    private void sop(Object o){
        System.out.print(o);
    }

    private void sopl(Object o) {
        System.out.println(o);
    }
}
