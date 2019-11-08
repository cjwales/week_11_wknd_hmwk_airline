public class Plane {

    private PlaneType model;

    public Plane(PlaneType model) {
        this.model = model;
    }

    public PlaneType getModel() {
        return model;
    }

    public int getCapacity() {
        return model.getCapacity();
    }

    public int getTotalWeight() {
        return model.getTotalWeight();
    }
}
