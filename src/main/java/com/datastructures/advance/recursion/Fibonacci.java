package com.datastructures.advance.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Fibonacci {

    public Map<Integer,Integer> memo;

    public Fibonacci() {
        memo = new HashMap<>();
    }

    public int fibonacci(int n) {
        if(n <= 1){
            return 1;
        }

        return fibonacci(n-1)+fibonacci(n-2);
    }


    // using memoization
    public int fibonacci2(int n){
        if(memo.containsKey(n)) return memo.get(n);
        if(n <= 1) return 1;

        int result = fibonacci(n-1)+fibonacci(n-2);
        memo.put(n,result);

        return result;
    }


    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        long start = System.currentTimeMillis();
        System.out.println(fibonacci.fibonacci(10));
        long end = System.currentTimeMillis();
        System.out.println(TimeUnit.MILLISECONDS.convert(end-start,TimeUnit.SECONDS));

        long start1 = System.currentTimeMillis();
        System.out.println(fibonacci.fibonacci2(10));
        long end1 = System.currentTimeMillis();
        System.out.println(TimeUnit.MILLISECONDS.convert(end1-start1,TimeUnit.SECONDS));
    }
}
