package onaircraft;

public class Pilot extends Crew{

    private String name;
    private String pilotLicenceNum;

    public Pilot(CrewType crewType, String name, String pilotLicenceNum) {
        super(crewType);
        this.name = name;
        this.pilotLicenceNum = pilotLicenceNum;
    }

    public String getName() {
        return name;
    }

    public String getPilotLicenceNum() {
        return pilotLicenceNum;
    }

    public String flyPlane(){
        return "Weeeeeee *Woosh noises*";
    }
}
