package com.example.algoritm.oneListLast;

public class LinkedListNode {

  private LinkedListNode nextElement;
  private int id; // for demo purpose

  public LinkedListNode(LinkedListNode next, int id) {
    this.nextElement = next;
    this.id = id;
  }

  public LinkedListNode nextElement() {
    return nextElement;
  }

  public static void main(String[] args) {
    LinkedListNode node8 = new LinkedListNode(null, 7);
    LinkedListNode node7 = new LinkedListNode(node8, 7);
    LinkedListNode node6 = new LinkedListNode(node7, 6);
    LinkedListNode node5 = new LinkedListNode(node6, 5);
    LinkedListNode node4 = new LinkedListNode(node5, 4);
    LinkedListNode node3 = new LinkedListNode(node4, 3);
    LinkedListNode node2 = new LinkedListNode(node3, 2);
    LinkedListNode node1 = new LinkedListNode(node2, 1);

    // List: node1 -> node2 -> node3 -> node4 -> node5
    LinkedListNode middle = findMiddleElement(node1);
    System.out.println("middle element id: " + middle.id);
  }

  /**
   *
   * @param firstElement not null ref to first node.
   * @return
   */
  public static LinkedListNode findMiddleElement(LinkedListNode firstElement) {
    LinkedListNode middle = firstElement;
    LinkedListNode currentNode = firstElement;
    boolean even = true;
    while (currentNode.nextElement() != null) {
      currentNode = currentNode.nextElement();
      if (even)
        even = false;
      else {
        even = true;
        middle = middle.nextElement();
      }
    }

    return middle;
  }
}