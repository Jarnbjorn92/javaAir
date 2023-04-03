package aircraft;

import onaircraft.CabinCrew;
import onaircraft.Passenger;
import onaircraft.Pilot;

import java.util.ArrayList;

public abstract class Plane {

    private PlaneType planeType;

    private int passengerBooking;
    private ArrayList<Passenger> passengers;
    private ArrayList<CabinCrew> cabinCrew;
    private ArrayList<Pilot> pilot;

    public Plane(PlaneType planeType){
        this.planeType = planeType;
        this.passengers = new ArrayList<>();
        this.cabinCrew = new ArrayList<>();
        this.pilot = new ArrayList<>();
        this.passengerBooking = 10;

    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public String addPassenger(Passenger passenger) {
        if(passengerBooking > 1){
            passengers.add(passenger);
            passengerBooking -= 1;
            return "Booking success";
        } else {
            return "No space";
        }
    }

    public ArrayList<CabinCrew> getCabinCrew() {
        return cabinCrew;
    }

    public void setCabinCrew(ArrayList<CabinCrew> cabinCrew) {
        this.cabinCrew = cabinCrew;
    }

    public ArrayList<Pilot> getPilot() {
        return pilot;
    }

    public void setPilot(ArrayList<Pilot> pilot) {
        this.pilot = pilot;
    }

    public void addCabinCrew(CabinCrew cabinCrew) {
        this.cabinCrew.add(cabinCrew);
    }

    public void addPilot(Pilot pilot) {
        this.pilot.add(pilot);
    }


}
