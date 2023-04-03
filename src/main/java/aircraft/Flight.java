package aircraft;

import onaircraft.Passenger;

public class Flight extends Plane{

    private String flightNum;
    private String destination;
    private String dptAirport;
    private String dptTime;


    public Flight(PlaneType planeType, String flightNum, String destination, String dptAirport, String dptTime) {
        super(planeType);
        this.flightNum = flightNum;
        this.destination = destination;
        this. dptAirport = dptAirport;
        this.dptTime = dptTime;
    }


    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDptAirport() {
        return dptAirport;
    }

    public void setDptAirport(String dptAirport) {
        this.dptAirport = dptAirport;
    }

    public String getDptTime() {
        return dptTime;
    }

    public void setDptTime(String dptTime) {
        this.dptTime = dptTime;
    }


}
