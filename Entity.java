import greenfoot.Actor;

/**
 * Write a description of class Entity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Entity  extends Actor
{
    protected void destroySelf(){
        this.getWorld().removeObject(this);
    }

    protected Countdown createCountdown(int START_COUNT){
        return new Countdown(START_COUNT, this.getWorld());
    }

    protected Cooldown createCooldown(int START_COUNT){
        return new Cooldown(START_COUNT, this.getWorld());
    }

}
