/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lamgiathinh.mathutil.main;

import com.lamgiathinh.mathutil.core.MathUtil;

/**
 *
 * @author mac
 */
public class MathUtilMain {
    public static void main(String args[]) {
        try {
            int n = 10;
            System.out.printf("%d", MathUtil.getFactorial(n));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
