import java.util.Objects;

/**
 * The Vector2D class is a Vector in a two dimension environment.
 * It has the attributes
 *  x and y
 * @author tobias bück
 * @version 1
 */
final public class Vector2D {

    private final double x;
    private final double y;

    public Vector2D(final double x, final double y){
        this.x = x;
        this.y = y;
    }

    public Vector2D scalarMultiplication(final double scalar){
        double newX = this.x * scalar;
        double newY = this.y * scalar;
        return new Vector2D(newX, newY);
    }

    public Vector2D addVector(Vector2D vector2D){
        double newX = this.x + vector2D.x;
        double newY = this.y + vector2D.y;
        return new Vector2D(newX, newY);
    }

    public Vector2D getRounded(){
        int newX = (int) Math.round(this.x);
        int newY = (int) Math.round(this.y);
        return new Vector2D(newX, newY);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
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
