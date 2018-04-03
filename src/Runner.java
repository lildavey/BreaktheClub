import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import mayflower.Mayflower;
import mayflower.World;

public class Runner extends Mayflower{

    public Runner()
    {

        super("Break the Club", 1424, 768);

    }



    @Override
    public void init() {
        GameWorld world = new GameWorld();
        Mayflower.setWorld(world);
    }
    public static void main(String[] args)
    {
        new Runner();
    }
}