public enum PlaneType {

    BOEING747(100, 200),
    BOEING737(150, 300),
    BOEING777(200, 400),
    AIRBUS8350(300, 600);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
