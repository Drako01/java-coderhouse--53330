package com.coder.house.ventas.online.ventasonline;

import java.math.BigDecimal;

public class GFG {
	public static void main(String[] args)
    {
        // BigDecimal object to store the result
        BigDecimal sum;
  
        // For user input
        // Use Scanner or BufferedReader
  
        // Two objects of String created
        // Holds the values to calculate the sum
        String input1
            = "0.0";
        String input2
            = "4256456484464684864864";
  
        // Convert the string input to BigDecimal
        BigDecimal a
            = new BigDecimal(input1);
        BigDecimal b
            = new BigDecimal(input2);
  
        // Using add() method
        sum = a.add(b);
  
        // Display the result in BigDecimal
        System.out.println("The sum of\n"
                           + a + " \nand\n" + b + " "
                           + "\nis\n" + sum + "\n");
    }
}
