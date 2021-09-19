package com.ocp_8.chapter08IO;

/**
 * Created by Kanat KB on 19.10.2017.
 * 16. Why shouldn’t every class be marked Serializable? (Choose all that apply.)
 * <p>
 * 16. D, F. Any class, abstract, concrete, or final, can be marked Serializable, so A, B, and E
 * are incorrect. Classes can implement multiple interfaces, so C is also incorrect. D is correct,
 * because process-heavy classes would be difficult to serialize since it may involve managing
 * multiple threads. F is also correct because serialization of an object stores only the instance
 * variable data, not the static class data. In other words, serializing an object throws away
 * the static class data.
 * <p>
 * A. The compiler will throw an exception if certain classes are marked Serializable.
 * B. Only final classes can be marked Serializable.
 * C. Classes can implement only one interface, so marking them Serializable would
 * prevent them from using any other interface.
 * D. The data of some classes cannot be easily serialized, such as those managing threads or processes.    ***
 * E. Only concrete classes can be marked Serializable.
 * F. Classes that store most of their data in static fields would not be easily serialized.               ***
 */
public class Test16 {
}
