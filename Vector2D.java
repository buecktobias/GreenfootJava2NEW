
import java.util.Objects;

/**
 * The Vector2D class is a Vector in a two dimension environment.
 * It has the attributes
 *  x and y
 * @author tobias bück
 * @version 1
 */
public class Vector2D {

    private double x;
    private double y;

    public Vector2D(double x, double y){
        this.setX(x);
        this.setY(y);
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector2D vector2D = (Vector2D) o;
        return Double.compare(vector2D.x, x) == 0 &&
                Double.compare(vector2D.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
