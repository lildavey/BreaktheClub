import mayflower.World;

public class GameWorld extends World {
    public GameWorld()
    {
        PowerBar narnar = new PowerBar();
     //setBackground("");
     addObject(new IceBlock(50,50),50,50);
     addObject(narnar, 400, 300);
     addObject(new Bar(narnar), 400,292);
    }
    @Override
    public void act() {

    }
}
