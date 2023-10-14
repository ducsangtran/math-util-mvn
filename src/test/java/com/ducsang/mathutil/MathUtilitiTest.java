/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.ducsang.mathutil;

import com.ducsang.mathutil.core.MathUtilMvn;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.ducsang.mathutil.core.MathUtilMvn;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author Adminn
 */
/**
 *
 * @author Admin
 */
public class MathUtilitiTest {
    //Cấu trúc của test case gồm: ID hoặc Desc hoặc Step/Procedures | Expected Result | Status
    //Test case #1: - Verify getFactorial(with n = 0)
    //Step: 
        // 1.Given n = 0
        // 2.Call/invoke getFactorial (n=0)
    //Expected Result:
            // the method must return 1 as the result of 0!
    //Status: PASSED | FALLED đoán xem, chờ code xong, chạy mới biết được
    @Test
    public void verifyFactorialGivenRightArgument0ReturnOk() throws IllegalAccessException {
        assertEquals(1, MathUtilMvn.getFactorial(0));
        
    }
    
    //Test case #2: - Verify getFactorial(with n = 1)
    //Step: 
        // 1.Given n = 1
        // 2.Call/invoke getFactorial (n=1)
    //Expected Result:
            // the method must return 1 as the result of 1!
    //Status: PASSED | FALLED đoán xem, chờ code xong, chạy mới biết được
     @Test
    public void verifyFactorialGivenRightArgument1ReturnOk() throws IllegalAccessException{
        assertEquals(1, MathUtilMvn.getFactorial(0));
        
    }
    //Test case #3: - Verify getFactorial(with n = 5)
    //Step: 
        // 1.Given n = 5
        // 2.Call/invoke getFactorial (n=5)
    //Expected Result:
            // the method must return 120 as the result of 5!
    //Status: PASSED | FALLED đoán xem, chờ code xong, chạy mới biết được
     @Test
    public void verifyFactorialGivenRightArgument5ReturnOk() throws IllegalAccessException{
        assertEquals(120, MathUtilMvn.getFactorial(5));
        
    }
    
}
