import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.geometry.Rectangle2D;



public class GameScene extends Scene {
    public Camera camera;
    private StaticThing leftBackground;
    private StaticThing rightBackground;

    public GameScene(int cameraX,int cameraY, String backgroundFile, Camera camera) {
        super(new Group(), cameraX, cameraY);
        this.camera = new Camera(cameraX, cameraY);
        Group root = (Group) getRoot();

        this.leftBackground = new StaticThing(cameraX, cameraY, backgroundFile);
        this.rightBackground = new StaticThing(cameraX, cameraY, backgroundFile);
        this.leftBackground.getImageView().setLayoutX(0);
        this.rightBackground.getImageView().setLayoutX(cameraX);
        root.getChildren().addAll(leftBackground.getImageView(), rightBackground.getImageView());
        this.camera = camera;
    }

        public void render(){

            double cameraX = camera.getX();
            double cameraY = 800;

           leftBackground.getImageView().setLayoutX(-cameraX);
           rightBackground.getImageView().setLayoutX(800 - cameraX);
        }

    }
