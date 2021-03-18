package com.ocp.chapter04Functional;

/**
 * Created by Kanat KB on 02.10.2017.
 * 15. The partitioningBy() collector creates a Map<Boolean, List<String>> when passed to
 * collect() by default. When specific parameters are passed to partitioningBy(), which
 * return types can be created? (Choose all that apply.)
 * <p>
 * 15. D, E. Choices A and B do not compile, because they are invalid generic declarations. Primitives
 * are not allowed as generics, and Map must have two generic types. Choice C is incorrect
 * because partitioning only gives a Boolean key. Choices D and E are correct because the
 * result Collection can be customized.
 * <p>
 * A. Map<boolean, List<String>>
 * B. Map<Boolean, Map<String>>
 * C. Map<Long, TreeSet<String>>
 * D. Map<Boolean, List<String>>  ***
 * E. Map<Boolean, Set<String>>   ***
 * F. None of the above
 */
public class Test15 {
}
