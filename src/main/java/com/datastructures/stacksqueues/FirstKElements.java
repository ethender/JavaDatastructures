package com.datastructures.stacksqueues;

import java.util.ArrayList;

public class FirstKElements {

    public static Queue<Integer> reverseK(Queue<Integer> queue, int k) {
        Queue<Integer> result = new Queue<>();

        if(k < 0){
            return queue;
        }

        ArrayList<Integer> reverse = new ArrayList<>();
        for(int i =0 ; i<k;i++){
            reverse.add(queue.dequeue());
        }


        for(int i=reverse.size()-1;i>=0;i--){
            result.enqueue(reverse.get(i));
        }

        while(!queue.isEmpty()){
            result.enqueue(queue.dequeue());
        }

        return result;

    }



    public static void main(String[] args){
        //int[] test = new int[] {1,2,3,-4,5,6,7,8,9,10};
        int[] test = new int[] {2,3};
        Queue<Integer> case1 = new Queue<>();
        for(int i: test){
            case1.enqueue(i);
        }

        Queue<Integer> result = reverseK(case1,2);

        while(!result.isEmpty()){
            System.out.print(result.dequeue()+" ");
        }

    }
}
