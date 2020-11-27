package com.classe;

import java.util.Arrays;

public class Calculator
{
    public int sum(int a, int b)
    {
        return a+b;
    }
    
      public  int minus(int a, int b)
    {
        return a-b;
    }
      
    public int divide(int a, int b)
    {
        return a/b;
    }
    
    public int multiply(int a, int b)
    {
        return a*b;
    }
    
    public int min(int a, int b)
    {
        if(a<=b)
           return a;
        else 
            return b;
    }
    
    public int max(int a, int b)
    {
         if(a<=b)
           return b;
        else 
            return a;
    }
    
    
}
