package ru.netology.sqr;

public class SQRService {
    public int sqrRootRange(int number1, int number2) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= number1 && i * i <= number2) {
                counter++;
            }
        }
        return counter;
    }
}
