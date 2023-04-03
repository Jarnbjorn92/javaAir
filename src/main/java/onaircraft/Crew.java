package onaircraft;

public abstract class Crew {

    private CrewType crewType;

    public Crew(CrewType crewType){
        this.crewType = crewType;
    }

    public CrewType getCrewType() {
        return crewType;
    }

}
