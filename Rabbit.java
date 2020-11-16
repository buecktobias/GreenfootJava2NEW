import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rabbit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rabbit extends MovingActor
{
    public Rabbit(){
        super(1);
    }
    /**
     * Act - do whatever the Rabbit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
    }

    public void throwStar(){
        ThrowStar s = new ThrowStar();
        this.getWorld().addObject(s, this.getX(), this.getY());
        s.getThrown(this.getLastDirection());
    }
}
