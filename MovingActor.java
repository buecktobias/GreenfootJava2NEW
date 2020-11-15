import greenfoot.World;

public abstract class MovingActor extends Entity {
    private Vector2D position;
    private Vector2D currentSpeed;
    private int speed;

    public MovingActor() {
        super();
        this.currentSpeed = new Vector2D(0,0);
        this.position = new Vector2D(100, 100);
    }

    public void act(){
        this.moveBy(this.getCurrentSpeed());
    }

    @Override
    protected void addedToWorld(World world) {
        super.addedToWorld(world);
        this.position = new Vector2D(this.getX(), this.getY());
    }

    protected void moveDirection(Direction direction, double distance){
        Vector2D newMovingVector = direction.getVector2D().scalarMultiplication(distance);
        this.moveBy(newMovingVector);
    }

    protected void moveBy(Vector2D vector2D){
        Vector2D newPosition = this.position.addVector(vector2D);
        this.turnTowards(newPosition.getIntX(), newPosition.getIntY());
        this.setPosition(newPosition);
    }

    public Vector2D getPosition() {
        return position;
    }

    public void setPosition(Vector2D position) {
        this.position = position;
        this.setLocation(position.getIntX(), position.getIntY());
    }

    public void setCurrentSpeed(Vector2D currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public Vector2D getCurrentSpeed() {
        return this.currentSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
