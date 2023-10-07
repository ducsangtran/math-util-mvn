package com.ducsang.mathutil.core;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author Adminn
 */
public class MathUtilMvn {
   
    public static final double PI = 3.1415;
    
    
    //àm tính n! = 1.2.3.4
    // n< 0> 20 ko tính do 21! tràn kiểu long
    //ko tính giai thừa âm!!!
    //0! = 1! = 1
    public static long getFactorial(int n) throws IllegalAccessException{
        long result = 1;
        
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be betwen 0...20");
        
        
        if(n==0 || n== 1)
            return 1;
        
        for(int i = 2; i <= n; i++)
            result *= i;
            
        
        return result;
    }
}
