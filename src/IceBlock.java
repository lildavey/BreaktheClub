import mayflower.Actor;

import mayflower.Mayflower;
import mayflower.World;

import java.util.ArrayList;
import java.util.List;


public class IceBlock extends Actor {
    private Mayflower mayflower;
    public int height, health, row, col;

    public IceBlock(int height, int r, int c, int health ){
        this.height = height; this.health = health; this.row =r; this.col = c;
        //this.setLocation(x,y);
        this.setImage("img/Ice_Block.png");



    }

    @Override
    public void act() {

    }
    public updateHealth(){

    }

    public int getHealth() {
        return health;
    }

    public int getHeight() {
        return height;
    }


}
