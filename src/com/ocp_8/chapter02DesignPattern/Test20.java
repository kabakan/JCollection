package com.ocp_8.chapter02DesignPattern;

/**
 * Created by Kanat KB on 29.08.2017.
 * <p>
 * 20. Choose the correct statement about the following code:
 * <p>
 * 20. A. Although the definition of methods on lines 2 and 5 vary, both will be converted to
 * public abstract by the compiler. Line 4 is fine, because an interface can have public or
 * default access. Finally, the class Falcon doesn’t need to implement the interface methods
 * because it is marked as abstract. Therefore, the code will compile without issue.
 * <p>
 * A. It compiles without issue.  ***
 * B. The code will not compile because of line 2.
 * C. The code will not compile because of line 4.
 * D. The code will not compile because of line 5.
 * E. The code will not compile because of lines 2 and 5.
 * F. The code will not compile because the class Falcon doesn’t implement the interface methods.
 */
public class Test20 {
}

interface CanFly {
    void fly();
}

interface HasWings {
    public abstract Object getWingSpan();
}

abstract class Falcon implements CanFly, HasWings {

}