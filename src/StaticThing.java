import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class StaticThing {
    private double sizeX;
    private double sizeY;
    private ImageView imageView;

    public StaticThing(double sizeX, double sizeY, String fileName) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.imageView = new ImageView(new Image(fileName));
        this.imageView.setFitWidth(sizeX);
        this.imageView.setFitHeight(sizeY);
    }

    public ImageView getImageView() {
        return imageView;
    }
}