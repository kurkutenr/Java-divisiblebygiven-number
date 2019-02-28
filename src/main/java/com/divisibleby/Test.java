/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.divisibleby;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author narayan
 */
public class Test {

    /**
     * 
     * @param numbersBetween
     * @param data 
     */
    private void Logic(List<Integer> numbersBetween, Map<Integer, String> data) {
        try {
            int start = numbersBetween.get(0);
            int end = numbersBetween.get(1);
            
            if(start > end) { 
                int temp = start;
                start = end;
                end = temp;
            }
            
            // as mentioned between the numbers so not considering the start and end
            start++;
            for (int i = start; i < end; i++) {
                boolean flag = false;

                // Get all divisible by number and its prinitng value
                for (Integer key : data.keySet()) {
                    if (i % key == 0) {
                        flag = true;
                        System.out.print(data.get(key) + " ");
                    }
                }

                if (!flag) {
                    System.out.print(i);
                }

                System.out.print("\n");

            }
        } catch (Exception ex) {
            System.out.println("Somthing went wrong");
            ex.printStackTrace();
        }
    }

    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        Test testObj = new Test();
        Map<Integer, String> divisibleByMap = new HashMap<>();
        divisibleByMap.put(2, "aa");
        divisibleByMap.put(7, "bbb");
        
        // print details between the numbers
        List<Integer> numbersBetween = Arrays.asList(1,100);

        testObj.Logic(numbersBetween, divisibleByMap);
    }
}
