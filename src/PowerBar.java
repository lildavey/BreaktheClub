import mayflower.Actor;
import mayflower.Keyboard;
import mayflower.Mayflower;

public class PowerBar extends Actor {
    public PowerBar()
    {
        setImage("img/barBG.jpg");
    }

    @Override
    public void act() {

    }
}
class Bar extends Actor
{
    private int speedVar, percent;
    private PowerBar thisBar;
    private IceBlock drop=null;
    private boolean isRunning = true;
    private GameWorld game;
    public Bar(PowerBar tempBar)
    {
        speedVar = 0;
        percent  = 0;
        thisBar = tempBar;
        //setLocation(thisBar.getX(), thisBar.getY()-8);
        setImage("img/puff.png");
        setRotation(0);
    }
    public void startMover() {

        speedVar = 5;
    }

 public void moveBlock(IceBlock drop, GameWorld game){
        this.drop=drop; this.game = game;
        if(isRunning)
            if(Mayflower.isKeyPressed(Keyboard.KEY_SPACE))
            {
                setSpeedVar(0);
                drop.setHeight(drop.getHeight() + this.getPercent()/2);
                drop.setHealth(drop.getHealth() - this.getPercent()/4);
                //drop.setLocation(drop.getX(), drop.getY()+this.getPercent()/2);
                game.IceBlockCalc(drop);
               // drop.
                //isRunning = false;
                this.drop = null;


            }

 }




    public int getPercent()
    {
        int temp = getCenterX() - thisBar.getX(); percent = temp/4;
        return percent;
    }
    public int getSpeedVar()
    {
            return speedVar;
    }

    public void setSpeedVar(int newSpeed)
    {
        speedVar = newSpeed;
    }

    @Override
    public void act() {
        //this.getPercent();

        if(getX() == thisBar.getX()) setRotation(0);
        else if(getX()+getImage().getWidth() >= thisBar.getX()+thisBar.getImage().getWidth())
            setRotation(180);
       move(speedVar);
       if(isRunning&&(drop!=null))
           moveBlock(drop, game);

    }
}