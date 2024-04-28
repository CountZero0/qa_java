package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    private static final String MALE = "Самец";
    @Mock
    Feline feline;

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion(MALE, feline);
        List<String> expectedFoodList = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFoodList);
        assertEquals(lion.getFood(), expectedFoodList);
    }

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion(MALE, feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        assertEquals(1, actual);
        }

    @Test
    public void lionExceptionTest() {
        try {
            Lion lion = new Lion("нечто", feline);
        } catch (Exception exception) {
            assertEquals("Используйте допустимые значения пола животного - Самец или Самка",
                    exception.getMessage());
        }
    }

}
