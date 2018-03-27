import mayflower.World;

public class GameWorld extends World {

    public IceBlock[][] iceBlocks;
    public GameWorld() {
        setBackground("img/tileMap.png");
        iceBlocks = new IceBlock[9][9];
        PowerBar narnar = new PowerBar();
        addObject(narnar, 0, 0);

        int x;
        int y;
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++) {
                y = i * 33 + 33 * j;
                x = j * 55 - 55 * i;
                IceBlock newOne = new IceBlock(50, 50);
                iceBlocks[i][j] = newOne;
                addObject(newOne, 700 + x, 50 + y);


            }
    }

    @Override
    public void act(){

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
