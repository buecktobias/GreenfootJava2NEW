import greenfoot.World;

public abstract class MovingActor extends Entity {
    private Vector2D position;

    public MovingActor() {

    }

    @Override
    protected void addedToWorld(World world) {
        super.addedToWorld(world);
        this.position = new Vector2D(this.getX(), this.getY());
    }

    public Vector2D getPosition() {
        return position;
    }

    public void setPosition(Vector2D position) {
        this.position = position;
    }
}
