package com.ocp.chapter08IO;

/**
 * Created by Kanat KB on 19.10.2017.
 * 6. Which of the following are true statements about serialization in Java? (Choose all that apply.)
 * <p>
 * 6. A, E. The first statement is the definition of deserialization, so A is correct. B is incorrect,
 * because you may mark (or not mark) a class as serializable for a variety of reasons. C is
 * incorrect because the Serializable interface has no method requirements, and any class
 * can implement the interface. D is also incorrect, because the Serializable interface may
 * be extended by your own interface. Finally, E is correct, because the exception may be
 * thrown within the readObject() even if the result is not cast.
 * <p>
 * A. The process of converting serialized data back into memory is called deserialization.   ***
 * B. All non-thread classes should be marked Serializable.
 * C. The Serializable interface requires implementing serialize() and deserialize()
 * methods.
 * D. The Serializable interface is marked final and cannot be extended.
 * E. The readObject() method of ObjectInputStream may throw a ClassNotFoundException   ***
 * even if the return object is not explicitly cast.
 */
public class Test06 {
}
