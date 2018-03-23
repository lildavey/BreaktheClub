import mayflower.Actor;

import mayflower.Mayflower;
import mayflower.World;

import java.util.ArrayList;
import java.util.List;


public class IceBlock extends Actor {
    private Mayflower mayflower;
    public int height, health, row, col;
    public int[][] iceblocks;

    public IceBlock(int height, int row, int col, int health , int[][] iceblocks ){
        this.height = height; this.health = health; this.row = row; this.col = col; this.iceblocks = iceblocks;

        this.setImage("img/Ice_Block.png");


    }

    @Override
    public void act() {

    }
  public updateHealth() {
        if(row)

    }

        


    public int getHealth() {
        updateHealth();
         return health;
    }

    public int getHeight() {
        return height;
    }


}
