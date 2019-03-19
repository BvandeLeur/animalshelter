package Animals;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ReservorTests {
    @Test
    public void testConstructor() {
        Date reservedAt = new Date();
        Reservor reservor = new Reservor("John Doe", reservedAt);
        assertEquals("John Doe", reservor.getName());
        assertEquals(reservedAt, reservor.getReservationDate());
    }

}
