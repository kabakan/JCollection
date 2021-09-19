package com.ocp_8.chapter07Concurrency;

/**
 * Created by Kanat KB on 12.10.2017.
 * 6. Which happens when more tasks are submitted to a thread executor than available threads?
 * <p>
 * A. The thread executor will throw an exception when a task is submitted that is over its
 * thread limit.
 * B. The task will be added to an internal queue and completed when there is an available
 * thread.
 * C. The thread executor will discard any task over its thread limit.  ***
 * D. The call to submit the task to the thread executor will wait until there is a thread available
 * before continuing.
 * E. The thread executor creates new temporary threads to complete the additional tasks.
 */
public class Test06 {
}
