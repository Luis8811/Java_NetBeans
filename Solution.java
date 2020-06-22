/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaloopsii;

/**
 *
 * @author Luis Manuel Suárez
 */
import java.util.*;
import java.io.*;
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Exercise Java Loops II. Hacker Rank");
         Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        List<Integer> A = new LinkedList<>();
        List<Integer> B = new LinkedList<>();
        List<Integer> N = new LinkedList<>();

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            A.add(a);
            B.add(b);
            N.add(n);
        }
        in.close();
        // Creating series
        for (int j = 0; j < t; j++) {
            int currentA = A.get(j);
            int currentB = B.get(j);
            int currentN = N.get(j);
            createSerie(currentA, currentB, currentN);
            if (j <= t-1) {
            System.out.println();
            }
        }
    }
    
     public static void createSerie(int a, int b, int n) {
        int[] pow = new int[n];
        int[] results = new int[n];
        for(int i = 0; i < n; i++) {
            pow[i] = (int)Math.pow(2, i) * b;
            results[i] += a;
            for (int j = 0; j <= i; j++) {
                results[i] += pow[j];
            }
        }
         printArray(results);
    }
     
     public static void printArray(int[] a) {
      for(int i = 0; i < a.length; i++) {
      if (i <= a.length - 1) {
          System.out.print(String.valueOf(a[i]) + " ");
      } else {
          System.out.print(String.valueOf(a[i]));
      }
      }
     }
    
}
