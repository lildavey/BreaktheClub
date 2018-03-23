import mayflower.Actor;

import mayflower.Mayflower;
import mayflower.MayflowerImage;
import mayflower.World;

import java.util.ArrayList;
import java.util.List;


public class IceBlock extends Actor {
    private Mayflower mayflower;
    public int height, health;

    public IceBlock(int height, int health ){
        this.height = height; this.health = health;

        MayflowerImage img = new MayflowerImage("img/first_cube.png");

        setImage(img);


    }

    @Override
    public void act() {

    }
/*    public updateHealth(){
        
    }*/

    public int getHealth() {
        return health;
    }

    public int getHeight() {
        return height;
    }


}
