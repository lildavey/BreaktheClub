import mayflower.Actor;

import mayflower.Mayflower;
import mayflower.MayflowerImage;
import mayflower.World;

import java.util.ArrayList;
import java.util.List;


public class IceBlock extends Actor {
    private Mayflower mayflower;
    public int height, health;//, row, col;
    //public int[][] iceblocks;

    public IceBlock(int height, int health  ){
        this.height = height; this.health = health;// this.row = row; this.col = col; //this.iceblocks = iceblocks;

        MayflowerImage img = new MayflowerImage("img/first_cube.png");

        setImage(img);


    }

    @Override
    public void act() {

    }


        

/*
    public int getHealth() {
        updateHealth();
         return health;
    }
    */

    public int getHeight() {
        return height;
    }


}
