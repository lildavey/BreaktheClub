import mayflower.Actor;

public class PowerBar extends Actor {
    public PowerBar(int newx,int newy)
    {
        setLocation(newx,newy);
        setImage("barBG.jpg");
    }

    @Override
    public void act() {

    }
}
class Bar extends Actor
{
    private int speedVar, percent;
    private PowerBar thisBar;
    public Bar(PowerBar tempBar)
    {
        speedVar = 1;
        percent  = 0;
        thisBar = tempBar;
        setLocation(thisBar.getX(), thisBar.getY()-8);
        setImage("bar.jpg");
        setRotation(90);
    }

    public int getPercent()
    {
        int temp = getCenterX() - thisBar.getX(); percent = temp/4;
        return percent;
    }

    @Override
    public void act() {
        this.getPercent();
        if(getX() == thisBar.getX()) setRotation(90);
        else if(getX()+15 == thisBar.getX()+400) setRotation(270);
        move(speedVar);
    }
}