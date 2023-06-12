package org.utils;

public class ArrayHelper {

    public String getFirst(String[] array)
    {
        if (array == null || array.length==0) return "";

        return array[0];
    }

    public String getLast(String[] array)
    {
        // Arrayer börjar alltid på noll
        // Arrayers längd är alltså en värde mer än sista postitionen
        // { "Marcus", "Johan", "Lars" }
        // Längden = 3
        // Sista postionen är 2, för att första positionen är 0
        return array[array.length-1];
        // Vad händer om arrayen är 1 post lång
        // Vad händer om arrayen är 0 post lång (tom)
        // Vad händer om array är null
    }

}
