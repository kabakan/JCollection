package com.ocp_8.chapter03Collections;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Kanat KB on 11.09.2017.
 * <p>
 * 19. Which options are true of the following code? (Choose all that apply.)
 * <p>
 * 19. A, D. A LinkedList implements both List and Queue. The List interface has a method to
 * remove by index. Since this method exists, Java does not autobox to call the other method.
 * Queue has only the remove by object method, so Java does autobox there. Since the number
 * 1 is not in the list, Java does not remove anything for the Queue.
 * <p>
 * A. If we fill in the blank with List, the output is [10].  ***
 * B. If we fill in the blank with List, the output is [10, 12].
 * C. If we fill in the blank with Queue, the output is [10].
 * D. If we fill in the blank with Queue, the output is [10, 12]. ***
 * E. The code does not compile in either scenario.
 * F. A runtime exception is thrown.
 */
public class Test19 {
    public static void main(String[] args) {
        List<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(12);
        q.remove(1);
        System.out.print(q);
    }
}
