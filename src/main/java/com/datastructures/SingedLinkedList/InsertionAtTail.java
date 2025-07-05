package com.datastructures.SingedLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class InsertionAtTail {

    public static LinkedListNode<Integer> insertAtTail(LinkedListNode <Integer> head, int value) {

        LinkedListNode<Integer> node = new LinkedListNode<>(value);
        if(Objects.isNull(head)){
            return node;
        }else{
            LinkedListNode<Integer> ptr = head;
            while(true){
                if(Objects.isNull(ptr.next)){
                    ptr.next = node;
                    break;
                }else{
                    ptr = ptr.next;
                }
            }
        }

        return head;
    }


    public static LinkedListNode<Integer> generateLinkedList(List<Integer> arr){
        if(Objects.isNull(arr)){
            return null;
        }

        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> ptr = null;
        for(int i : arr){
            LinkedListNode<Integer> temp = new LinkedListNode<>(i);

            if(Objects.isNull(head)){
                head = temp;
                ptr = head;
            }else{
                ptr.next = temp;
                ptr = temp;
            }
        }

        return head;
    }

    public static void main(String[] args){
        int[] test = new int[] {1,10,8,4,9};
        List<Integer> l = Arrays.stream(test).boxed().toList();
        LinkedListNode<Integer> sample = generateLinkedList(l);

        LinkedListNode<Integer> ptr = insertAtTail(null,5);

        while(Objects.nonNull(ptr)){
            System.out.println(ptr.data);
            ptr = ptr.next;
        }


    }
}
