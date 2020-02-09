package com.leyou.search.test;

import org.junit.Test;

public class ViewTest {

    @Test
    public void testV(){
        int sum = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                for (int k = 1; k < 5; k++) {
                    if(i != j && i != k && j != k){
                        sum++;
                        System.out.println(""+i+j+k);
                    }
                }
            }
        }
        System.out.println(sum);
    }

    @Test
    public void maobao(){
        int temp = 0;
        int[] a = new int[]{1000,80,612,12,32,15,321,12,36,18};
        for (int i = 0; i < 9; i++) {
            for (int j = 1; j < 10; j++) {
                if(a[j-1]>a[j]){
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(a[9]);
        System.out.println(a[8]);

        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }

    @Test
    public void hua(){
        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 100; i < 1000; i++) {
            a = i/100;
            b = i%100/10;
            c = i%10;

            if(a*a*a+b*b*b+c*c*c == i){
                System.out.println(i);
            }
        }
    }

}
