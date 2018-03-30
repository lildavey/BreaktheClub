import mayflower.*;

import java.util.ArrayList;

import mayflower.Mayflower;

public class GameWorld extends World {

    public IceBlock[][] iceBlocks;
    public PowerBar narnar = new PowerBar();
    public Bar puff = new Bar(narnar);

    public GameWorld() {
        setBackground("img/bg.jpg");
        iceBlocks = new IceBlock[9][9];


        addObject(narnar, 0, 0);
        addObject(puff, 0, 0);

        int x;
        int y;
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++) {
                y = i * 33 + 33 * j;
                x = j * 55 - 55 * i;
                IceBlock newOne = new IceBlock(100, 10);
                iceBlocks[i][j] = newOne;
                addObject(newOne, 700 + x, 50 + y);


            }

        iceBlocks[0][1].setImage("img/first_cube - Copy.png");
        //IceBlockCalc();
    }

    @Override
    public void act() {
        // if(Mayflower.mouseClicked(IceBlock.class))

        ArrayList<IceBlock> temp = new ArrayList<>();
        for (IceBlock actor : getObjects(IceBlock.class)) {
            if (Mayflower.mouseClicked(actor)) {
                temp.add(actor);

            }
        }

        if (!temp.isEmpty()) {
            IceBlock highest = temp.get(0);


            //System.out.println(i);

            for (IceBlock Icetemp : temp) {
                if (Icetemp.getY() > highest.getY()) highest = Icetemp;
            }
            highest.setImage("img/Ice-pick.png");
            puff.startMover();
            puff.moveBlock(highest, this);


        }


    }
    public void IceBlockCalc(IceBlock calc, int rec) {
        if (rec < 0)
            return;
        for (int r = iceBlocks.length - 1; r > 0; r--)
            for (int c = iceBlocks[r].length - 1; c > 0; c--) {
                Integer[][] matrix = {
                        {0, 0, 0},
                        {0, 0, 0},
                        {0, 0, 0}
                };

                try {
                    matrix[1][1] = iceBlocks[r][c].getHeight();
                    matrix[0][1] = iceBlocks[r - 1][c].getHeight(); //top
                    matrix[2][1] = iceBlocks[r + 1][c].getHeight();// bottom
                    matrix[1][0] = iceBlocks[r][c - 1].getHeight(); // left
                    matrix[1][2] = iceBlocks[r][c + 1].getHeight();// right
                    matrix[2][0] = iceBlocks[r + 1][c - 1].getHeight();
                    matrix[2][2] = iceBlocks[r + 1][c + 1].getHeight();
                    matrix[0][0] = iceBlocks[r - 1][c - 1].getHeight();
                    matrix[0][2] = iceBlocks[r - 1][c + 1].getHeight();


                } catch (Exception e) {
                    // e.printStackTrace();
                }
                Integer[][] side = {
                        {0, 0, 0},
                        {0, 0, 0},
                        {0, 0, 0}
                };
                try {
                   int height = matrix[1][1];
                    side[0][1] = 100-Math.abs(matrix[0][1]- height); //top
                   if(r==0)
                    side[0][1] = 100-Math.abs(100 - height); //top
                    side[2][1] =  100-Math.abs(matrix[2][1] - height);// bottom
                    if(r==iceBlocks.length-1)
                    side[2][1] =  100-Math.abs(100 - height);// bottom
                    side[1][0] = 100-Math.abs(matrix[1][0]- height); // left
                    if(c==0)
                    side[1][0] = 100-Math.abs(100- height); // left
                    side[1][2] = 100-Math.abs(matrix[1][2]-height);// right
                    if(c==iceBlocks[r].length-1)
                    side[1][2] = 100-Math.abs(100-height);// right
                    if (iceBlocks[r][c] == calc)
                    System.out.println("test" + side[0][1] + "," + Math.abs(matrix[0][1]- height) + "," + matrix[0][1]+ ","+ height);



                } catch (Exception e) {
                    // e.printStackTrace();
                }
                if(side[0][1]+side[2][1] <165 && side[1][0]+side[1][2]<165)
                    iceBlocks[r][c].setDead(true);

/*
                if(iceBlocks[r][c].isDead()){
                    try {
                        IceBlockCalc(iceBlocks[r - 1][c + 0], rec-1);
                        // IceBlockCalc(iceBlocks[r][c+0]);
                        IceBlockCalc(iceBlocks[r + 1][c + 0], rec-1);
                        IceBlockCalc(iceBlocks[r - 1][c - 1], rec-1);
                        IceBlockCalc(iceBlocks[r - 1][c + 1], rec-1);
                        IceBlockCalc(iceBlocks[r + 1][c - 1], rec-1);
                        IceBlockCalc(iceBlocks[r + 1][c + 1], rec-1);
                        IceBlockCalc(iceBlocks[r][c + -1], rec-1);
                        IceBlockCalc(iceBlocks[r][c + 1], rec-1);
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                    }

                }*/



            }
    }

    public void IceBlockCalcold(IceBlock calc, int rec) {
        if(rec<0)
            return;
        for (int r = iceBlocks.length - 1; r > 0; r--)
            for (int c = iceBlocks[r].length - 1; c > 0; c--) {
                if (iceBlocks[r][c] != calc)
                    continue;
                int iceBlockGet = iceBlocks[r][c].getHeight();
                Integer[][] matrix = {
                        {0, 0, 0},
                        {0, 0, 0},
                        {0, 0, 0}
                };

                try {
                    matrix[1][1] = iceBlocks[r][c].getHeight();
                    matrix[0][1] = iceBlocks[r - 1][c].getHeight();
                    matrix[2][1] = iceBlocks[r + 1][c].getHeight();
                    matrix[1][0] = iceBlocks[r][c - 1].getHeight();
                    matrix[1][2] = iceBlocks[r][c + 1].getHeight();
                    matrix[2][0] = iceBlocks[r + 1][c - 1].getHeight();
                    matrix[2][2] = iceBlocks[r + 1][c + 1].getHeight();
                    matrix[0][0] = iceBlocks[r - 1][c - 1].getHeight();
                    matrix[0][2] = iceBlocks[r - 1][c + 1].getHeight();


                } catch (Exception e) {
                    // e.printStackTrace();
                }
                Integer[][] a = matrix;
                int x = a[0][0] * ((a[1][1] * a[2][2]) - (a[2][1] * a[1][2]));
                int y = -a[0][1] * ((a[0][1] * a[2][2]) - (a[2][0] * a[1][2]));
                int z = a[0][2] * ((a[1][0] * a[2][1]) - (a[1][1] * a[2][0]));

                int det = x + y + z;

                int add = 0;
                for (int i = matrix.length - 1; i > 0; i--)
                    for (int j = matrix[i].length - 1; j > 0; j--) {
                        if (Math.abs(det * .001) > .3)
                            add += matrix[i][j] * (iceBlocks[i][j].getHealth() * Math.abs(det * .001));
                        else {
                            add += matrix[i][j] * (iceBlocks[i][j].getHealth() * .2);
                        }
                    }
                int avg = add / 9;

                det = det * avg;



                //System.out.println(avg);
                iceBlocks[r][c].setLocation(iceBlocks[r][c].getX(), iceBlocks[r][c].getY() + (avg));
Double dropScore = 0.0;
                if (Math.abs(det * .001) > .3)
                    dropScore = (10 - iceBlocks[r][c].getHealth()) * Math.abs(det * .001);
                else {
                    dropScore =10 - iceBlocks[r][c].getHealth() + .0;
                }
                if(dropScore>1000){
                    try {
                        IceBlockCalc(iceBlocks[r - 1][c + 0], rec-1);
                        // IceBlockCalc(iceBlocks[r][c+0]);
                        IceBlockCalc(iceBlocks[r + 1][c + 0], rec-1);
                        IceBlockCalc(iceBlocks[r - 1][c - 1], rec-1);
                        IceBlockCalc(iceBlocks[r - 1][c + 1], rec-1);
                        IceBlockCalc(iceBlocks[r + 1][c - 1], rec-1);
                        IceBlockCalc(iceBlocks[r + 1][c + 1], rec-1);
                        IceBlockCalc(iceBlocks[r][c + -1], rec-1);
                        IceBlockCalc(iceBlocks[r][c + 1], rec-1);
                    }
                    catch(StackOverflowError e)
                    {
                        e.printStackTrace();
                    }
                }

            }
    }
}


