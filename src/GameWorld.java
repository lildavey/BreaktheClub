import mayflower.World;

public class GameWorld extends World {
    public GameWorld() {
        PowerBar narnar = new PowerBar();
        //setBackground("");
        addObject(new IceBlock(50, 50), 50, 50);
        addObject(narnar, 400, 300);
        addObject(new Bar(narnar), 400, 292);
        iceBlocks = new IceBlock[9][9];
        setBackground("img/tileMap.png");


        int x;
        int y;
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++) {
                y = i * 33 + 33 * j;
                x = j * 55 - 55 * i;
                addObject(new IceBlock(50, 50), 700 + x, y);
            }


    }

    @Override
    public void act() {

    }
}
