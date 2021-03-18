package com.example.algoritm.oneListLast;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindMiddleElementOfLinkedList {

   /**
   * @param args
   */
  public static void main(String[] args) {
    Node<Integer> head1 = new Node<Integer>(1);

    Node<Integer> node2 = new Node<Integer>(2);
    head1.next = node2;

    Node<Integer> node3 = new Node<Integer>(3);
    node2.next = node3;

    Node<Integer> node4 = new Node<Integer>(4);
    node3.next = node4;

    Node<Integer> node5 = new Node<Integer>(5);
    node4.next = node5;

    Node<Integer> node6 = new Node<Integer>(6);
    node5.next = node6;

    Node<Integer> node7 = new Node<Integer>(7);
    node6.next = node7;

    Node<Integer> node8 = new Node<Integer>(8);
    node7.next = node8;

    Node<Integer> node9 = new Node<Integer>(9);
    node8.next = node9;

    FindMiddleElementOfLinkedList service = new FindMiddleElementOfLinkedList();
    Node<Integer> middleOne = service.findMiddleElementOfLinkedList(head1);

    System.out.println(middleOne.value);
 }

  public Node<Integer> findMiddleElementOfLinkedList(Node<Integer> head) {
    if (head == null) {
      throw new IllegalArgumentException("head is null");
    }

    Node<Integer> result = head;
    Node<Integer> doubleJumpNode = head;
    while (doubleJumpNode.next != null && doubleJumpNode.next.next != null) {
      doubleJumpNode = doubleJumpNode.next.next;
      result = result.next;
    }

    return result;

  }

  private static class Node<T> {
    public T value;
    public Node<T> next;

    public Node(T value) {
     // super();
      this.value = value;
    }

  }
}
