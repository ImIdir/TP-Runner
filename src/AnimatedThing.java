import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

public class AnimatedThing {
    private double x;
    private double y;
    private ImageView imageView;
    private Integer attitude;
    private int currentFrameIndex;
    private int maxFrameIndex;
    private int durationBetweenFrames;
    private int windowSize;
    private int frameOffset;

    public AnimatedThing(double x, double y, String fileName, int attitude, int maxFrameIndex,
                         int durationBetweenFrames, int windowSize, int frameOffset) {
        this.x = x;
        this.y = y;
        this.attitude = attitude;
        this.maxFrameIndex = maxFrameIndex;
        this.durationBetweenFrames = durationBetweenFrames;
        this.windowSize = windowSize;
        this.frameOffset = frameOffset;

        Image spriteSheet = new Image(fileName);
        this.imageView = new ImageView(spriteSheet);
        this.currentFrameIndex = 0;

    }

    public ImageView getImageView() {
        return imageView;
    }
}
