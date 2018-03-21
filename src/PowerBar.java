import mayflower.Actor;

public class PowerBar extends Actor {
    private int speed,percent;

    public PowerBar(int newx,int newy)
    {
        setLocation(newx,newy);
        setImage("barBG.jpg");
    }

    @Override
    public void act() {

    }
}
