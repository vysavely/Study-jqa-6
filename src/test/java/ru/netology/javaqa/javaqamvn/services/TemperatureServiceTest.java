package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemperatureServiceTest {

    @Test
    public void shouldFindBetweenEnd() {
        TemperatureService service = new TemperatureService();

        int[] temps = {15, 20, 18, 4, 34};

        int expectedDay = 3;
        int actualDay = service.getMinDay(temps);

        Assertions.assertEquals(expectedDay, actualDay);
        System.out.println(actualDay);
        System.out.println(temps.length);

    }

    @Test
    public void minTempPerDay() {
        TemperatureService service = new TemperatureService();

        int[] temps = {15, 20, 18, 4, 34};

        int expectedMinTemp = 4;
        int actualMinTemp = service.getMinTemp(temps);

        Assertions.assertEquals(expectedMinTemp, actualMinTemp);
        System.out.println("Минимальная температура: " + actualMinTemp);

    }

    @Test
    public void minTempPerDay2For() {
        TemperatureService service = new TemperatureService();

        int[] temps = {15, 20, 18, 4, 34};

        int expectedMinTemp = 4;
        int actualMinTemp = service.getMinTemp2(temps);

        Assertions.assertEquals(expectedMinTemp, actualMinTemp);
        System.out.println("Минимальная температура: " + actualMinTemp);

    }
}
