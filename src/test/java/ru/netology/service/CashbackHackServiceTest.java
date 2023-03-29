package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {


    @Test
    public void zeroAmount() {
        int amount = 0;
        CashbackHackService service = new CashbackHackService ();
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }
    @Test
    public void amountLessThousand() {
        int amount = 700;
        CashbackHackService service = new CashbackHackService ();
        int expected = 300;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
    @Test
    public void amountMoreThousand() {
        int amount = 2600;
        CashbackHackService service = new CashbackHackService ();
        int expected = 400;
        int actual = service.remain(amount);
        assertEquals(actual, expected);


    }
    @Test
    public void amountMultipleThousand() {
        int amount = 3000;
        CashbackHackService service = new CashbackHackService ();
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);


    }
}