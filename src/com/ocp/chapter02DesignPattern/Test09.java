package com.ocp.chapter02DesignPattern;

/**
 * Created by Kanat KB on 26.08.2017.
 * <p>
 * 9. What changes need to be made to make the following singleton pattern correct? (Choose all that apply.)
 * <p>
 * 9. D, F. A is incorrect, as there are definitely some problems with the singleton implementation.
 * B and C are incorrect, as naming of the instance variable and access method are not
 * required as part of the pattern. The public modifier on the cheetahManager instance
 * means that any class can access or even replace the instance, which breaks the singleton
 * pattern; hence D is required to fix the implementation. E is incorrect, as marking the
 * instance final would prevent lazy instantiation and as the code would not compile. F is
 * also required, since without this step two threads could create two distinct instances of the
 * singleton at the same time, which would violate the singleton pattern.
 * <p>
 * A. None; the singleton pattern is properly implemented.
 * B. Rename cheetahManager to instance.
 * C. Rename getCheetahManager() to getInstance().
 * D. Change the access modifier of cheetahManager from public to private.
 * E. Mark cheetahManager final.
 * F. Add synchronized to getCheetahManager().
 */
public class Test09 {


}

class CheetahManager {
    public static CheetahManager cheetahManager;

    private CheetahManager() {
    }

    public static CheetahManager getCheetahManager() {
        if (cheetahManager == null) {
            cheetahManager = new CheetahManager();
        }
        return cheetahManager;
    }
}