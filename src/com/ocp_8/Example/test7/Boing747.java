package com.ocp_8.Example.test7;

interface Flier {
    public void takeOff();
    public void land();
}

abstract class Plane implements Flier {   // line 1

    // line 2

    public void land() { }
}

//class Boeing747 extends Plane {           // line 3
abstract class Boeing747 extends Plane {

    // line 4
//    public void takeOff() { }

    public void land() { }
}
