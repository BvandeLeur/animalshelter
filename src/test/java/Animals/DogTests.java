package Animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DogTests {
    private Dog dog = new Dog("Sgt. Woof", Gender.Male);

    @Test
    public void testConstructor() {
        assertEquals("Sgt. Woof", dog.getName());
        assertEquals(Gender.Male, dog.getGender());
        assertNull(dog.getReservor());
        // Assert.assertEquals(new Date(), dog.LastWalk);
        assertFalse(dog.NeedsAWalk());
    }

    @Test
    @SuppressWarnings("Duplicates")
    public void testReservation() {
        assertNull(dog.getReservor());
        assertTrue(dog.Reserve("John Doe"));
        assertNotNull(dog.getReservor());
        assertEquals(dog.getReservor().getName(), "John Doe");
        assertFalse(dog.Reserve("Jane Doe"));
    }
}
