import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.List;

/**
 * Write a description of class ThrowStar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThrowStar extends Projectile
{
    public ThrowStar(){
        super(5);
    }

    /**
     * Act - do whatever the ThrowStar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
    }

    protected void hasHit(List<CanBeHit> cbh){
        cbh.get(0).hit();
        this.getWorld().removeObject(this);
    }

    public void shoot(Direction d, CanShoot canShoot){
        super.shoot(canShoot);
        this.changeDirection(d);
    }

}
