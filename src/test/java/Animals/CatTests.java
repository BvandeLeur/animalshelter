package Animals;

import org.junit.*;

public class CatTests {
    private Cat cat = new Cat("Ms. Meow", Gender.Female, "Scratches couch");

    @Test
    public void testConstructor() {
        Assert.assertEquals("Ms. Meow", cat.getName());
        Assert.assertEquals(Gender.Female, cat.getGender());
        Assert.assertNull(cat.getReservor());
        Assert.assertEquals(cat.getBadHabits(), "Scratches couch");
    }

    @Test
    @SuppressWarnings("Duplicates")
    public void testReservation() {
        Assert.assertNull(cat.getReservor());
        Assert.assertTrue(cat.Reserve("John Doe"));
        Assert.assertNotNull(cat.getReservor());
        Assert.assertEquals(cat.getReservor().getName(), "John Doe");
        Assert.assertFalse(cat.Reserve("Jane Doe"));
    }
}
