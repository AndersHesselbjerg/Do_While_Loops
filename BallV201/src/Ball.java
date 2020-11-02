import java.util.Objects;

public abstract class Ball implements Comparable<Ball> {

    private int size;
    private String name;

    public Ball(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public String extraInfo() {
        return this.getClass().getName();
    }

    public Boolean isTennisBall() {
        return false;
    }

    @Override
    public int compareTo(Ball o) {
        if (o.isTennisBall() && !this.isTennisBall()) {
            return 1;
        } else {
            if (this.isTennisBall() && !o.isTennisBall()) {
                return -1;
            } else {
                Integer ii = this.getSize();
                return ii.compareTo(o.getSize());
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return size == ball.size &&
                Objects.equals(name, ball.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, name);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //@Override
    public String toString() {
        return "Ball{" +
                "size=" + size +
                ", name='" + name + '\'' + this.extraInfo() +
                '}';
    }
}
