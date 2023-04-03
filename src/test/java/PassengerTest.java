import onaircraft.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PassengerTest {

    Passenger passenger;

    @Before public void before(){
        passenger = new Passenger("Connor", 1);
    }

    @Test public void passengerHasAName(){
        assertEquals("Connor", passenger.getName());
    }

    @Test public void passengerHasBags(){
        assertEquals(1, passenger.getBags());
    }
}
