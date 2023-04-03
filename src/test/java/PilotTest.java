import onaircraft.CrewType;
import onaircraft.Pilot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before public void before(){
        pilot = new Pilot(CrewType.CAPTAIN, "Danielle", "D4N13LL3");
    }

    @Test public void hasACrewType(){
        assertEquals(CrewType.CAPTAIN, pilot.getCrewType());
    }

    @Test public void hasAName(){
        assertEquals("Danielle", pilot.getName());
    }

    @Test public void hasLicenceNum(){
        assertEquals("D4N13LL3", pilot.getPilotLicenceNum());
    }

    @Test public void canFly(){
        assertEquals("Weeeeeee *Woosh noises*", pilot.flyPlane());
    }
}
