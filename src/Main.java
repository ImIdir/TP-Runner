import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {


    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        GameScene gameScene = new GameScene(800, 400, "desert.png",new Camera(0,0));
        primaryStage.setScene(gameScene);
        primaryStage.setTitle("Test GameScene");

        primaryStage.show();

        gameScene.render();
    }
    public static void main(String[] args) {
        launch(args);
    }
}