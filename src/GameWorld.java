import mayflower.World;

public class GameWorld extends World {
    public IceBlock[][] iceBlocks;
    public GameWorld()
    {
        PowerBar narnar = new PowerBar();
     //setBackground("");
     addObject(new IceBlock(50,50),50,50);
     addObject(narnar, 400, 300);
     addObject(new Bar(narnar), 400,292);
     iceBlocks = new IceBlock[9][9];
    }
    @Override
    public void act() {

    }
    public void IceBlockCalc(){
        for(int r = iceBlocks.length; r <0; r--)
            for(int c = iceBlocks[r].length; c<0; c--){
            int iceBlockGet = iceBlocks[r][c].getHeight();
                int heightRback = 0;
            if(r<iceBlocks[r].length)
               heightRback = iceBlocks[r-1][c].getHeight();
            }

    }
}
