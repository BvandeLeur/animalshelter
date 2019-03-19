import Animals.Gender;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReservationTests {
    private Reservation reservation = Reservation.getInstance();

    @Test
    public void testNewCat() {
        assert(0 == reservation.getAnimals().size());
        reservation.newCat("Ms. Meow", Gender.Female, "Scratches couch");
        assert(1 == reservation.getAnimals().size());
    }

    @Test
    public void testNewDog() {
        assertEquals(1, reservation.getAnimals().size());
        reservation.newDog("Stg. Woof", Gender.Male);
        assertEquals(2, reservation.getAnimals().size());
    }
}
