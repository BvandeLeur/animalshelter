import Animals.Gender;
import org.junit.*;

public class ReservationTests {
    private Reservation reservation = Reservation.getInstance();

    @Test
    public void testNewCat() {
        Assert.assertEquals(0, reservation.getAnimals().size());
        reservation.newCat("Ms. Meow", Gender.Female, "Scratches couch");
        Assert.assertEquals(1, reservation.getAnimals().size());
    }

    @Test
    public void testNewDog() {
        Assert.assertEquals(1, reservation.getAnimals().size());
        reservation.newDog("Stg. Woof", Gender.Male);
        Assert.assertEquals(2, reservation.getAnimals().size());
    }
}
