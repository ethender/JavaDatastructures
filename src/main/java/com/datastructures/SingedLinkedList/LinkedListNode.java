package com.datastructures.SingedLinkedList;

public class LinkedListNode<T> {

     protected  T data;
     protected LinkedListNode<T> next;

     public LinkedListNode(T data) {
         this.data = data;
         this.next = null;
    }

}
