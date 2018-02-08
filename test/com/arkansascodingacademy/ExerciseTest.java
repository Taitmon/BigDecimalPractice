package com.arkansascodingacademy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseTest
{
    private final Exercise exercise = new Exercise();
    private final BigDecimal FIVE = new BigDecimal("5.00");
    private final BigDecimal TEN_FORTY_FIVE = new BigDecimal("10.45");
    private final BigDecimal EIGHT_TWENTY_THREE = new BigDecimal("8.23");
    private final BigDecimal TWENTY_FIVE_NINETY_THREE = new BigDecimal("25.93");
    private final BigDecimal TWO_FORTY_FIVE = new BigDecimal("2.45");

    @Test
    void addTwoBigDecimal()
    {
        BigDecimal total = exercise.add(FIVE, TEN_FORTY_FIVE);
        assertEquals(new BigDecimal("15.45"), total);
    }

    @Test
    void addThreeBigDecimal()
    {
        BigDecimal result = exercise.add(FIVE, TEN_FORTY_FIVE, EIGHT_TWENTY_THREE);
        assertEquals(new BigDecimal("23.68"), result);
    }

    @Test
    void subtract()
    {
        BigDecimal result = exercise.subtract(TEN_FORTY_FIVE, FIVE);
        assertEquals(new BigDecimal("5.45"), result);
    }

    @Test
    void multiply()
    {
        BigDecimal result = exercise.multiply(TEN_FORTY_FIVE, EIGHT_TWENTY_THREE);
        assertEquals(new BigDecimal("86.0035"), result);
    }

    @Test
    void divide()
    {
        BigDecimal result = exercise.divide(TEN_FORTY_FIVE, EIGHT_TWENTY_THREE);
        assertEquals(new BigDecimal("1.27"), result);
    }

    @Test
    void addList()
    {
        List<BigDecimal> list = new ArrayList<>();
        list.add(TEN_FORTY_FIVE);
        list.add(FIVE);
        list.add(EIGHT_TWENTY_THREE);

        BigDecimal result = exercise.add(list);

        assertEquals(new BigDecimal("23.68"), result);
    }

    @Test
    void addArray()
    {
        BigDecimal[] array = new BigDecimal[3];
        array[0] = TEN_FORTY_FIVE;
        array[1] = FIVE;
        array[2] = EIGHT_TWENTY_THREE;

        BigDecimal result = exercise.add(array);

        assertEquals(new BigDecimal("23.68"), result);
    }

    @Test
    void average()
    {
        List<BigDecimal> list = new ArrayList<>();
        list.add(TEN_FORTY_FIVE);
        list.add(FIVE);
        list.add(EIGHT_TWENTY_THREE);

        BigDecimal result = exercise.average(list);

        assertEquals(new BigDecimal("7.89"), result);
    }

    @Test
    void smallest()
    {
        List<BigDecimal> list = new ArrayList<>();
        list.add(TEN_FORTY_FIVE);
        list.add(FIVE);
        list.add(TWO_FORTY_FIVE);
        list.add(EIGHT_TWENTY_THREE);

        BigDecimal result = exercise.smallest(list);

        assertEquals(TWO_FORTY_FIVE, result);
    }

    @Test
    void secondSmallest()
    {
        List<BigDecimal> list = new ArrayList<>();

        list.add(TEN_FORTY_FIVE);
        list.add(EIGHT_TWENTY_THREE);
        list.add(FIVE);
        list.add(EIGHT_TWENTY_THREE);
        list.add(EIGHT_TWENTY_THREE);
        list.add(TWO_FORTY_FIVE);

        BigDecimal result = exercise.secondSmallest(list);

        assertEquals(FIVE, result);
    }

    @Test
    void largest()
    {
        List<BigDecimal> list = new ArrayList<>();
        list.add(EIGHT_TWENTY_THREE);
        list.add(EIGHT_TWENTY_THREE);
        list.add(FIVE);
        list.add(EIGHT_TWENTY_THREE);
        list.add(TEN_FORTY_FIVE);
        list.add(TWO_FORTY_FIVE);
        list.add(TWO_FORTY_FIVE);
        list.add(TWO_FORTY_FIVE);

        BigDecimal result = exercise.largest(list);

        assertEquals(TEN_FORTY_FIVE, result);
    }

    @Test
    void secondLargest()
    {
        List<BigDecimal> list = new ArrayList<>();
        list.add(EIGHT_TWENTY_THREE);
        list.add(TWO_FORTY_FIVE);
        list.add(TWO_FORTY_FIVE);
        list.add(FIVE);
        list.add(TEN_FORTY_FIVE);
        list.add(TWO_FORTY_FIVE);

        BigDecimal result = exercise.secondLargest(list);

        assertEquals(EIGHT_TWENTY_THREE, result);
    }
}