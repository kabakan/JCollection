package com.ocp.chapter06Exception;

/**
 * Created by Kanat KB on 07.10.2017.
 * 15. Which of the following are checked exceptions? (Choose all that apply.)
 * <p>
 * 15. B, E. A checked exception extends Exception but not RuntimeException. The entire hierarchy
 * counts, so B and E are both correct.
 * <p>
 * A. One
 * B. Two   ***
 * C. Three
 * D. Four
 * E. Five  ***
 * F. Six
 */
public class Test15 {
}

class One extends RuntimeException {
}

class Two extends Exception {
}

class Three extends Error {
}

class Four extends One {
}

class Five extends Two {
}

class Six extends Three {
}