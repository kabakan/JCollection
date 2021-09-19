package com.ocp_8.Example;

public class AlphaTest {
    private Integer sum;
    public AlphaTest(Integer i) {
        this.sum = i;
    }

    static {
        System.out.println("static block!");
    }

    public Integer getSum() {
        return sum;
    }
}

class BetaTest extends AlphaTest {
    final static int a;
    final int b;
    static {
        a=123;
    }
    {
        b=1;
    }
    public BetaTest(){
        super(100);
    }
}

class Test{
    public static void main(String[] args) {
        System.out.println(new BetaTest().getSum());
    }
}

