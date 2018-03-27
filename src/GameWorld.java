import mayflower.World;

public class GameWorld extends World {
<<<<<<< HEAD
    public IceBlock[][] iceBlocks;
    public GameWorld()
    {
     setBackground("img/tileMap.png");
        iceBlocks = new IceBlock[9][9];

     int x;
     int y;
        for (int i = 0; i < 9; i++)
            for(int j =0;j<9;j++) {
                y=i*33+33*j;
                x=j*55-55*i;
                IceBlock newOne = new IceBlock(50, 50);
                iceBlocks[i][j] = newOne;
                addObject(newOne, 700+x, 50+y);
=======
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
>>>>>>> a69f1fce6ea3cb39406fba93eb1c2af0ae814703
            }


    }

    @Override
    public void act() {

    }
    public void IceBlockCalc(){
        for(int r = iceBlocks.length; r >0; r--)
            for(int c = iceBlocks[r].length; c>0; c--){
                int iceBlockGet = iceBlocks[r][c].getHeight();
                int heightRback = 0;
                if(r<iceBlocks[r].length)
                    heightRback = iceBlocks[r-1][c].getHeight();
            }

    }

}
