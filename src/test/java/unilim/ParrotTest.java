package unilim;

import static org.junit.Assert.*;
import org.junit.Test;

public class ParrotTest {

	@Test
    public void getSpeedOfEuropeanParrot() {
        Parrot parrot = new EuropeanParrot();
        assertEquals(parrot.getSpeed(), 12.0, 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_One_Coconut() {
        Parrot parrot = new AfricanParrot(1);
        assertEquals(parrot.getSpeed(), 3.0, 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_Two_Coconuts() {
    	 Parrot parrot = new AfricanParrot(2);
        assertEquals(parrot.getSpeed(), 0.0, 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_No_Coconuts() {
    	Parrot parrot = new AfricanParrot(0);
        assertEquals(parrot.getSpeed(), 12.0, 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_nailed() {
        Parrot parrot = new NorvegienParrot(0, true);
        assertEquals(parrot.getSpeed(), 0.0, 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed() {
    	Parrot parrot = new NorvegienParrot(1.5, false);
        assertEquals(parrot.getSpeed(), 18.0, 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
    	Parrot parrot = new NorvegienParrot(4, false);
        assertEquals(parrot.getSpeed(), 24.0, 0.0);
    }
}