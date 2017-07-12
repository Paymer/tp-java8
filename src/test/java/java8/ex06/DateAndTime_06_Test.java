package java8.ex06;

import org.junit.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Exercice 06 - Period
 */
public class DateAndTime_06_Test {

    @Test
    public void test_period() throws Exception {

        // TODO Créer une LocalDate au 31/12/2017
        LocalDate localDate1 = LocalDate.of(2017, 12, 31);

        // TODO Créer une LocalDate au 01/01/2050
        LocalDate localDate2 = LocalDate.of(2050, 01, 01);

        // TODO créer une période (classe java.time.Period) à entre les 2 précédentes dates
        Period result = Period.between(localDate1, localDate2);

        assertThat(result.toTotalMonths(), is(384L));
    }
}
