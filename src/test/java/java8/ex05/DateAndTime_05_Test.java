package java8.ex05;

import org.junit.Test;

import java.time.Duration;
import java.time.LocalTime;


import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Exercice 05 - Duration
 */
public class DateAndTime_05_Test {

    @Test
    public void test_duration() throws Exception {

        // TODO créer une heure à 12h30
        LocalTime time1 = LocalTime.of(12, 30);

        // TODO créer une heure à 16h32
        LocalTime time2 = LocalTime.of(16, 32);;

        // TODO créer une durée (classe java.time.Duration) qui représente le temps entre les heures précédentes
        Duration duration = Duration.between(time1, time2);

        assertThat(duration.toMinutes(), is(242L));
        assertThat(duration.toHours(), is(4L));
        assertThat(duration.toNanos(), is(14_520_000_000_000L));
        assertThat(duration.toMillis(), is(14_520_000L));
        assertThat(duration.toDays(), is(0L));

    }

    // Duration


}
