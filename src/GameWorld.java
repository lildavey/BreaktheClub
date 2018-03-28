import mayflower.*;

import java.util.ArrayList;

import mayflower.Mayflower;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GameWorld extends World {

    public IceBlock[][] iceBlocks;
    public PowerBar narnar = new PowerBar();
    public Bar puff = new Bar(narnar);

    public GameWorld() {
        setBackground("img/tileMap.png");
        iceBlocks = new IceBlock[9][9];


        addObject(narnar, 0, 0);
        addObject(puff, 0, 0);

        int x;
        int y;
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++) {
                y = i * 33 + 33 * j;
                x = j * 55 - 55 * i;
                IceBlock newOne = new IceBlock(Mayflower.getRandomNumber(100), 50);
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
            if(Mayflower.mouseClicked(actor)) {
                temp.add(actor);

            }
        }

        if(!temp.isEmpty()) {
            IceBlock highest = temp.get(0);


           //System.out.println(i);

            for (IceBlock Icetemp : temp) {
                if (Icetemp.getY() > highest.getY()) highest = Icetemp;
            }
            highest.setImage("img/first_cube - Copy.png");
            puff.startMover();
            puff.moveBlock(highest);




        }




    }

    public void IceBlockCalc() {
        for (int r = iceBlocks.length - 1; r > 0; r--)
            for (int c = iceBlocks[r].length - 1; c > 0; c--) {
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
                        add += matrix[i][j];
                    }
                int avg = add / 9;

                det = det * avg;
                System.out.println(det);


            }
    }

}
