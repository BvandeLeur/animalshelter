package Animals;

import org.junit.*;
import Animals.*;

import java.util.Date;

public class DogTests {
    private Dog dog = new Dog("Sgt. Woof", Gender.Male);

    @Test
    public void testConstructor() {
        Assert.assertEquals("Sgt. Woof", dog.getName());
        Assert.assertEquals(Gender.Male, dog.getGender());
        Assert.assertNull(dog.getReservor());
        // Assert.assertEquals(new Date(), dog.LastWalk);
        Assert.assertFalse(dog.NeedsAWalk());
    }

    @Test
    @SuppressWarnings("Duplicates")
    public void testReservation() {
        Assert.assertNull(dog.getReservor());
        Assert.assertTrue(dog.Reserve("John Doe"));
        Assert.assertNotNull(dog.getReservor());
        Assert.assertEquals(dog.getReservor().getName(), "John Doe");
        Assert.assertFalse(dog.Reserve("Jane Doe"));
    }
}
