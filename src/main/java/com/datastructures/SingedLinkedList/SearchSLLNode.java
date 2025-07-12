package com.datastructures.SingedLinkedList;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SearchSLLNode {

    public static boolean searchNode(LinkedListNode <Integer> head, int value) {
        if(Objects.isNull(head)){
            return false;
        }

        LinkedListNode<Integer> ptr = head;
        while(ptr != null){
            if(ptr.data == value){
                return true;
            }

            ptr = ptr.next;
        }

        return false;
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

        System.out.println(searchNode(sample,2));

    }
}
