package Animals;

import java.util.Date;
import org.junit.*;

import Animals.Reservor;


public class ReservorTests {
    @Test
    public void testConstructor() {
        Date reservedAt = new Date();
        Reservor reservor = new Reservor("John Doe", reservedAt);
        Assert.assertEquals("John Doe", reservor.getName());
        Assert.assertEquals(reservedAt, reservor.getReservationDate());
    }

}
