package com.ocp_8.chapter02DesignPattern;

/**
 * Created by Kanat KB on 04.08.2017.
 * <p>
 * 3. Which of the following are valid functional interfaces? (Choose all that apply.)
 * <p>

 */
public class Test03 {
}

interface ArcticMountainClimb extends MountainClimb {
    public default int getSpeed() {
        return 0;
    }
}

interface Climb {
    public int climb();
}

interface MountainClimb extends Climb {
}

abstract class Swim {
    public abstract Object swim(double speed, int duration);
}
