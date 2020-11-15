import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class src.worlds.MyWorld here.
 *
 * @author Tobias Bück
 * @version 1
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class src.worlds.MyWorld
     *
     */
    public MyWorld()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Snake s = new Snake();
        this.addObject(s, 100, 100);
    }
}
