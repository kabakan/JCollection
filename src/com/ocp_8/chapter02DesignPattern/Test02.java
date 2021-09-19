package com.ocp_8.chapter02DesignPattern;

/**
 * Created by Kanat KB on 03.11.2017.
 */
public class Test02 {
}

abstract class Chipmunk implements CanClimbTrees {
    public abstract void chew();
}


class EasternChipmunk extends Chipmunk {  //line 8.
    public void chew() {
        System.out.println("Eastern Chipmunk is Chewing");
    }

    @Override
    public void climb() {
    }
}

interface CanClimbTrees extends CanClimb {
}

interface CanClimb {
    public abstract void climb();
}