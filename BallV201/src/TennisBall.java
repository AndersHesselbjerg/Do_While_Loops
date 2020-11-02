public class TennisBall extends Ball {

    public TennisBall(int size, String name) {
        super(size, name);
    }

    @Override
    public Boolean isTennisBall() {
        return true;
    }
}
