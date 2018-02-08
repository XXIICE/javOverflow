/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoverflow;

/**
 *
 * @author ariya boonchoo
 */
public class JavaOverflow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        byte max = Byte.MAX_VALUE;
        byte min = Byte.MIN_VALUE;

        System.out.println("max : " + max);
        System.out.println("max : " + min);
        byte a = max;
        byte b= min;
        System.out.println("\nNew max (max++) : " + a++);
        System.out.println("New min (min--) : " + b--);
        System.out.println("\n*******************");

        byte result = 0;
        for (int i = 0; i <= 149; i++) {
            System.out.println("i = " + i + " result = " + result);
            result++;

        }

    }

}
