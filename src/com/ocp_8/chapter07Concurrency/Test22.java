package com.ocp_8.chapter07Concurrency;

import java.util.concurrent.ExecutionException;

/**
 * Created by Kanat KB on 12.10.2017.
 * 22. What is the result of executing the following program?
 * <p>
 * A. It prints 0 1 2 3 4
 * B. It prints 1 2 3 4 5
 * C. It prints null null null null null
 * D. It hangs indefinitely at runtime.
 * E. The output cannot be determined.
 * F. The code will not compile because of line n1.
 * G. The code will not compile because of line n2.
 */
public class Test22 {
}

class PrintCounter {
    static int counter = 0;

    public static void main(String[] args) throws InterruptedException,
            ExecutionException {
        /*ExecutorService service = Executors.newSingleThreadExecutor();
        List<Future<?>> results = new ArrayList<>();
        IntStream.iterate(0,i -> i+1).limit(5).forEach(
                //i -> results.add(service.execute(()-> counter++)) // n1
                i -> results.add(service.execute(()-> counter)) //
        );
        for(Future<?> result : results) {
            System.out.print(result.get()+" "); // n2
        }
        service.shutdown(); */
    }
}