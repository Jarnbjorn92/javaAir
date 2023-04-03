import aircraft.Flight;
import aircraft.PlaneType;
import onaircraft.CabinCrew;
import onaircraft.CrewType;
import onaircraft.Passenger;
import onaircraft.Pilot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger;
    Pilot pilot;
    CabinCrew cabinCrew;

    @Before public void before(){
        flight = new Flight(PlaneType.AIRBUS, "GLA475", "EDI", "GLA", "1300");
        passenger = new Passenger("Connor", 1);
        pilot = new Pilot(CrewType.CAPTAIN, "Danielle", "D4N13LL3");
        cabinCrew = new CabinCrew(CrewType.FLIGHT_ATTENDANT,"Taylor");
    }

    @Test public void canAddToPlane(){
        flight.addPassenger(passenger);
        flight.addCabinCrew(cabinCrew);
        flight.addPilot(pilot);
        assertEquals(1, flight.getPassengers().size());
        assertEquals(1, flight.getCabinCrew().size());
        assertEquals(1, flight.getPilot().size());
    }

    @Test public void canGetCapacity(){
        assertEquals(1, flight.getPlaneType().getCapacity());
    }

    @Test public void canBookIfNotOverCapacity(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.getPassengers().size());
    }

}
