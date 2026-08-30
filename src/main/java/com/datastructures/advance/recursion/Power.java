package com.datastructures.advance.recursion;

public class Power {

    public double myPow(double x, int n) {
        if(n< 0){
            x = 1.0/x;
            n = -n;
        }

        return fastPow(x, n);
    }


    /**
     *
     * If n is even: x^n = (x^(n/2))^2
     * If n is odd: x^n = x * (x^(n/2))^2
     * @param x
     * @param n
     * @return
     */
    private double fastPow(double x, int n) {
        // Base case
        if(n==0)
            return 1.0;


        double half = fastPow(x, n/2);

        if (n%2==0)
            return half*half;
        else
            return x*half*half;
    }
}
