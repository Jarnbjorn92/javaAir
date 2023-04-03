import onaircraft.CabinCrew;
import onaircraft.CrewType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew cabinCrew;

    @Before public void before(){
        cabinCrew = new CabinCrew(CrewType.FLIGHT_ATTENDANT, "Mathias");
    }

    @Test public void hasACrewType(){
        assertEquals(CrewType.FLIGHT_ATTENDANT, cabinCrew.getCrewType());
    }

    @Test public void cabinCrewHasAName(){
        assertEquals("Mathias", cabinCrew.getName());
    }

    @Test public void canGiveMessage(){
        assertEquals("Awryt", cabinCrew.speak());
    }
}
