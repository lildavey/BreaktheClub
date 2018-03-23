import mayflower.World;

public class GameWorld extends World {
    public IceBlock[][] iceBlocks;
    public GameWorld()
    {
     setBackground("");
     addObject(new IceBlock(50,50),50,50);
     iceBlocks = new IceBlock[9][9];
     
    }
    @Override
    public void act() {

    }
}
