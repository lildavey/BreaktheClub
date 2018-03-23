import mayflower.World;

public class GameWorld extends World {
    public GameWorld()
    {
     setBackground("img/tileMap.png");


     int x;
     int y;
        for (int i = 0; i < 10; i++) 
            for(int j =0;j<10;j++) {
                y=i*33+33*j;
                x=j*55-55*i;
                addObject(new IceBlock(50, 50), 700+x, y);
            }



    }
    @Override
    public void act() {

    }
}
