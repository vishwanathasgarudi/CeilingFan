package test.java.com.medavie;
import java.time.LocalDate;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import main.java.com.medavie.CeilingFan;

public class CeilingFanTest {

    @Test
    public void testPullCord1() {
        CeilingFan fan = new CeilingFan();

        fan.pullCord1();
        Assertions.assertEquals(1, fan.getSpeed());

        fan.pullCord1();
        Assertions.assertEquals(2, fan.getSpeed());

        fan.pullCord1();
        Assertions.assertEquals(3, fan.getSpeed());

        fan.pullCord1();
        Assertions.assertEquals(0, fan.getSpeed());

        fan.pullCord1();
        Assertions.assertEquals(1, fan.getSpeed());

        fan.pullCord1();
        Assertions.assertEquals(2, fan.getSpeed());

        fan.pullCord1();
        Assertions.assertEquals(3, fan.getSpeed());

        fan.pullCord1();
        Assertions.assertEquals(0, fan.getSpeed());
    }

    @Test
    public void testPullCord2() {
        CeilingFan fan = new CeilingFan();

        fan.pullCord2();
        Assertions.assertTrue(fan.isReverse());

        fan.pullCord2();
        Assertions.assertFalse(fan.isReverse());

        fan.pullCord2();
        Assertions.assertTrue(fan.isReverse());

        fan.pullCord2();
        Assertions.assertFalse(fan.isReverse());
    }

    @Test
    public void testChristmasDay() {
        LocalDate christmas = LocalDate.of(2023, 12, 25);
        LocalDate today = LocalDate.of(2023, 12, 25);
        CeilingFan fan = new CeilingFan();

        fan.pullCord2();
        Assertions.assertTrue(fan.isReverse());
    }
}

