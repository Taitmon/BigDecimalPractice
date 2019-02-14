package com.arkansascodingacademy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("WeakerAccess")
public class Exercise
{
    //Add two numbers together and return the result
    public BigDecimal add(BigDecimal firstNumber, BigDecimal secondNumber)
    {
        return firstNumber.add(secondNumber);
    }

    //Add three numbers together and return the result
    public BigDecimal add(BigDecimal firstNumber, BigDecimal secondNumber, BigDecimal thirdNumber)
    {

        return firstNumber.add(secondNumber).add(thirdNumber);
    }

    //Subtract the second number from the first and return the result
    public BigDecimal subtract(BigDecimal firstNumber, BigDecimal secondNumber)
    {
        return firstNumber.subtract(secondNumber);
    }

    //Multiply the two numbers and return the result
    public BigDecimal multiply(BigDecimal firstNumber, BigDecimal secondNumber)
    {
        return firstNumber.multiply(secondNumber);
    }

    //Divide the first number by the second number and return the result -- use round half up
    public BigDecimal divide(BigDecimal firstNumber, BigDecimal secondNumber)
    {
        BigDecimal quotient = firstNumber.divide(secondNumber, RoundingMode.HALF_UP);
        return quotient;
    }

    //Add a list of numbers together and return the result
    public BigDecimal add(List<BigDecimal> numbers)
    {
        BigDecimal sum = new BigDecimal("0.00");
            for (int i = 0; i < numbers.size(); i++)
            {
                sum = sum.add(numbers.get(i));
            }
            return sum;
    }

    //Add an array of numbers together and return the result
    public BigDecimal add(BigDecimal[] numbers)
    {
        BigDecimal sum = new BigDecimal("0.00");
        for (int i = 0; i < numbers.length; i++)
        {
            sum = sum.add(numbers[i]);
        }
        return sum;
    }

    //Return the average of a list of numbers -- use round half up
    public BigDecimal average(List<BigDecimal> numbers)
    {
        BigDecimal sum = new BigDecimal("0.00");
        BigDecimal dividingNum = new BigDecimal(numbers.size());

        for (int i = 0; i < numbers.size(); i++)
        {
            sum = sum.add(numbers.get(i));
        }
         BigDecimal average = sum.divide(dividingNum, RoundingMode.HALF_UP);

        return average;
    }

    //Return the smallest number from a list of numbers
    public BigDecimal smallest(List<BigDecimal> numbers)
    {
        Collections.sort(numbers);
        BigDecimal min = numbers.get(0);
        return min;
    }

    //Return the second smallest number from a list of numbers
    public BigDecimal secondSmallest(List<BigDecimal> numbers)
    {
        Collections.sort(numbers);
        BigDecimal min = numbers.get(1);
        return min;

    }

    //Return the largest number from a list of numbers
    public BigDecimal largest(List<BigDecimal> numbers)
    {
        Collections.sort(numbers);
        BigDecimal min = numbers.get(numbers.size()-1);
        return min;
    }

    //Return the second largest number from a list of numbers
    public BigDecimal secondLargest(List<BigDecimal> numbers)
    {
        Collections.sort(numbers);
        BigDecimal min = numbers.get(numbers.size()-2);
        return min;
    }


}
