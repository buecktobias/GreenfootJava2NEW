/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends MovingActor implements CanBeHit
{
    public Snake(){
        super(1);
    }

    @Override
    public void hit() {
        this.destroySelf();
    }

    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        this.doRandomMovement(0.01, 0.5);
    }
}
