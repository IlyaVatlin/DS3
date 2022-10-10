package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn300IfAmount700() {

        int actual = service.remain(700);
        int expected = 300;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn500IfAmount2500() {

        int actual = service.remain(2500);
        int expected = 500;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnZeroIfAmount1000() {

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }
}