public class Newtonian extends Telescope {

    boolean needToCollimate;

    public Newtonian(int diameter, int focallength, boolean needToCollimate) {
        super(diameter, focallength);
        this.needToCollimate = needToCollimate;
    }

    public boolean isNeedToCollimate() {
        return needToCollimate;
    }

    public void setNeedToCollimate(boolean needToCollimate) {
        this.needToCollimate = needToCollimate;
    }
}
