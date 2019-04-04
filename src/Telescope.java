public abstract class Telescope {

    private int diameter;
    private int focallength;

    public Telescope(int diameter, int focallength) {
        this.diameter = diameter;
        this.focallength = focallength;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getFocallength() {
        return focallength;
    }

    public void setFocallength(int focallength) {
        this.focallength = focallength;
    }

    @Override
    public String toString() {
        return "Telescope{" +
                "diameter=" + diameter +
                ", focallength=" + focallength +
                '}';
    }
}
