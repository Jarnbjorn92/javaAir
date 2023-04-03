package aircraft;

public enum PlaneType {
    BOEING(10, 1000),
    AIRBUS(1, 1000),
    ANTONOV(30, 2500);

    private final int capacity;
    private final int total_weight;


    PlaneType(int capacity, int total_weight) {
        this.capacity = capacity;
        this.total_weight = total_weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotal_weight() {
        return total_weight;
    }
}
