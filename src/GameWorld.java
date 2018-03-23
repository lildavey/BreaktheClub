import mayflower.World;

public class GameWorld extends World {
    public GameWorld()
    {
     setBackground("");
     addObject(new IceBlock(50,50),50,50);
    }
    @Override
    public void act() {

    }
}
