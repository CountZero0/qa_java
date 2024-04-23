package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void testEatMeat() throws Exception {
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, new Feline().eatMeat());
    }

    @Test
    public void testGetFamily() {
        assertEquals("Кошачьи", new Feline().getFamily());
    }

    @Test
    public void testGetKittensDefault() {
        assertEquals(1, new Feline().getKittens());
    }

    @Test
    public void testGetKittensWithParameter() {
        assertEquals(10, new Feline().getKittens(10));
    }
}
