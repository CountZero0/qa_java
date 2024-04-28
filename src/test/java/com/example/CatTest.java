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
public class CatTest {

    @Mock
    private Feline felineMock;

    @Test
    public void testGetSound() {
        assertEquals("Мяу", new Cat(felineMock).getSound());
    }

    @Test
    public void testGetFood() throws Exception {
        Cat cat = new Cat(felineMock);
        List<String> expectedFoodList = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(felineMock.eatMeat()).thenReturn(expectedFoodList);
        assertEquals(cat.getFood(), expectedFoodList);
    }
}
