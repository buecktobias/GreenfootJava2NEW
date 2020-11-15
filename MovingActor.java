import greenfoot.World;

public abstract class MovingActor extends Entity {
    private Vector2D position;

    public MovingActor() {
        super();
    }

    @Override
    protected void addedToWorld(World world) {
        super.addedToWorld(world);
        this.position = new Vector2D(this.getX(), this.getY());
    }
    protected void moveDirection(Direction direction, double distance){
        Vector2D newMovingVector = direction.getVector2D().scalarMultiplication(distance);
        Vector2D newPosition = this.position.addVector(newMovingVector);
        this.setPosition(newPosition);
    }

    public Vector2D getPosition() {
        return position;
    }

    public void setPosition(Vector2D position) {
        this.position = position;
        Vector2D rounded = position.getRounded();
        this.setLocation((int)rounded.getX(), (int)rounded.getY());
    }
}
