package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemainFallingShortOne() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testRemainFallingShort999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testRemainIfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testRemainIfAmountIs2000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int expected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testRemainFallingShortOneJunit5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testRemainFallingShort999Junit5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testRemainIfAmountIs1000Junit5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testRemainIfAmountIs2000Junit5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int expected = 0;
        int actual = service.remain(amount);
        Assertions.assertEquals(expected, actual);

    }
}