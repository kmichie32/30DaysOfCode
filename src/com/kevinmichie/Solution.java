package com.kevinmichie;

/**
 * Created by kevinmichie on 4/6/16.
 */
import java.io.*;
import java.util.*;

public class Solution {
    Scanner scanner = new Scanner(System.in);

    public void Loop(){
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("Type a number:");
        solution.Loop();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    }
}