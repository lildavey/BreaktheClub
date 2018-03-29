import mayflower.Actor;
import mayflower.Mayflower;
import mayflower.MayflowerImage;


public class IceBlock extends Actor {
    public int height, health;//, row, col;
    private Mayflower mayflower;
    //public int[][] iceblocks;
    private boolean isDead;

    public IceBlock(int height, int health) {
        this.height = height;
        this.health = health;// this.row = row; this.col = col; //this.iceblocks = iceblocks;

        MayflowerImage img = new MayflowerImage("img/Ice-temp.png");

        setImage(img);


    }

    public void setDead(boolean c) {
        isDead = c;
    }

    public boolean isDead()
    {
        return isDead;
    }

    @Override
    public void act() {
        while (getY() < 768 && isDead) {
            setLocation(getX(), getY() + 4);
        }
    }


    /*
        public int getHealth() {
            updateHealth();
             return health;
        }
        */
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


}
