import mayflower.Actor;

import mayflower.Mayflower;
import mayflower.World;

import java.util.ArrayList;
import java.util.List;


public class IceBlock extends Actor {
    private Mayflower mayflower;
    public int height, health;

    public IceBlock(int height, int x, int y, int health ){
        this.height = height; this.health = health;
        this.setLocation(x,y);
        this.setImage("img/Ice_Block.png");


    }

    @Override
    public void act() {

    }

    public int getHealth() {
        return health;
    }

    public int getHeight() {
        return height;
    }


}
