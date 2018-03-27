import mayflower.Actor;

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
    private boolean isRunning;
    public Bar(PowerBar tempBar)
    {
        speedVar = 0;
        percent  = 0;
        thisBar = tempBar;
        //setLocation(thisBar.getX(), thisBar.getY()-8);
        setImage("img/puff.png");
        setRotation(0);
    }

    public int getPercent()
    {
        int temp = getCenterX() - thisBar.getX(); percent = temp/4;
        return percent;
    }

    public void setSpeedVar(int newSpeed)
    {
        speedVar = newSpeed;
    }

    @Override
    public void act() {
        this.getPercent();
        if(getX() == thisBar.getX()) setRotation(0);
        else if(getX()+getImage().getWidth() == thisBar.getX()+thisBar.getImage().getWidth()) setRotation(180);
        move(speedVar);
    }
}