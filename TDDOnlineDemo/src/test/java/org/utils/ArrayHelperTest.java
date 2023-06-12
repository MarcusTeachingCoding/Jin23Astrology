package org.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayHelperTest {

    @Test
    void getFirst() {
        // Vad händer om arrayen är 1 post lång
        // Vad händer om arrayen är 0 post lång (tom)
        // Vad händer om array är null

        String[] arrayNormal=new String[]{"A","B","C"};
        String[] arrayOne=new String[]{"A"};
        String[] arrayEmpty=new String[]{};
        String[] arrayEvil=new String[]{null};
        ArrayHelper sut=new ArrayHelper();

        assertEquals("A", sut.getFirst(arrayNormal));
        assertEquals("A", sut.getFirst(arrayOne));
        assertEquals("", sut.getFirst(arrayEmpty));
        assertNull(sut.getFirst(arrayEvil));
        assertEquals("", sut.getFirst(null));

    }

    @Test
    void getLast() {
    }
}