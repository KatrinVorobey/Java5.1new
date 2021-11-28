package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @org.junit.jupiter.api.Test
    void shouldRangeSquareRoot() {
        SQRService service = new SQRService();

        int number1 = 3;
        int number2 = 4;
        int expected = 0;

        int actual = service.sqrRootRange(number1, number2);

        assertEquals(expected,actual);
    }

}