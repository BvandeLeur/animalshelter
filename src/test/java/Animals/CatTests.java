package Animals;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CatTests {
    private Cat cat = new Cat("Ms. Meow", Gender.Female, "Scratches couch");

    @Test
    public void testConstructor() {
        assertEquals("Ms. Meow", cat.getName());
        assertEquals(Gender.Female, cat.getGender());
        assertNull(cat.getReservor());
        assertEquals(cat.getBadHabits(), "Scratches couch");
    }

    @Test
    @SuppressWarnings("Duplicates")
    public void testReservation() {
        assertNull(cat.getReservor());
        assertTrue(cat.Reserve("John Doe"));
        assertNotNull(cat.getReservor());
        assertEquals(cat.getReservor().getName(), "John Doe");
        assertFalse(cat.Reserve("Jane Doe"));
    }
}
