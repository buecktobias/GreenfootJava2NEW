import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rabbit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rabbit extends MovingActor implements  CanShoot
{

    private Cooldown throwingCooldown;
    public Rabbit(){
        super(1);
    }

    @Override
    protected void addedToWorld(World world) {
        super.addedToWorld(world);
        this.throwingCooldown = this.createCooldown(10);
    }

    /**
     * Act - do whatever the Rabbit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
    }


    public void shoot(){
        if (this.throwingCooldown.activate()) {
            ThrowStar s = new ThrowStar();
            this.getWorld().addObject(s, this.getX(), this.getY());
            s.shoot(this.getLastDirection(), this);
        }
    }
}
