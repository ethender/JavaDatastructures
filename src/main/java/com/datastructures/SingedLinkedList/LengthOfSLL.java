package com.datastructures.SingedLinkedList;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class LengthOfSLL {

    public static int length(LinkedListNode <Integer> head) {
        if(head == null){
            return 0;
        }
        int result = 0;

        LinkedListNode<Integer> ptr = head;

        while(ptr!=null){
            result++;
            ptr = ptr.next;
        }

        return result;
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
        int[] test = new int[] {1,10,8,4};
        List<Integer> l = Arrays.stream(test).boxed().toList();
        LinkedListNode<Integer> sample = generateLinkedList(l);

        System.out.println(length(sample));


    }
}
