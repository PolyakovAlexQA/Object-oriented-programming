import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature();
        conditioner.setOn(true);
        int expected = 21;
        int actual = conditioner.setCurrentTemperature(21);
        assertEquals(actual, expected);


    }

    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(20);
        conditioner.decreaseCurrentTemperature();
        conditioner.setOn(true);
        int expected = 19;
        int actual = conditioner.setCurrentTemperature(19);
        assertEquals(expected,actual);

    }
}
