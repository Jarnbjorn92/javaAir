package onaircraft;

public class CabinCrew extends Crew{

    private String name;

    public CabinCrew(CrewType crewType, String name) {
        super(crewType);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak() {
        return "Awryt";
    }
}
