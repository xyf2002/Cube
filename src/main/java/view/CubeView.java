package view;

/*import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import model.Cube;

public class CubeView extends Application {
    private static final int TILE_SIZE = 50;
    private static final int FACE_SIZE = 3;

    private Cube cube;

    public CubeView() {
        cube = new Cube();
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();

        // 创建每个面的图形表示，并设置颜色
        for (int face = 0; face < 6; face++) {
            for (int row = 0; row < FACE_SIZE; row++) {
                for (int col = 0; col < FACE_SIZE; col++) {
                    Rectangle tile = new Rectangle(TILE_SIZE, TILE_SIZE);
                    tile.setStroke(Color.BLACK);

                    char color = cube.getFaceColor(face, row, col);
                    setColor(tile, color);

                    gridPane.add(tile, col + FACE_SIZE * getColumnOffset(face), row + FACE_SIZE * getRowOffset(face));
                }
            }
        }

        Scene scene = new Scene(gridPane);
        primaryStage.setTitle("Rubik's Cube");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // 设置图形表示的颜色
    private void setColor(Rectangle tile, char color) {
        switch (color) {
            case 'R':
                tile.setFill(Color.RED);
                break;
            case 'B':
                tile.setFill(Color.BLUE);
                break;
            case 'G':
                tile.setFill(Color.GREEN);
                break;
            case 'O':
                tile.setFill(Color.ORANGE);
                break;
            case 'W':
                tile.setFill(Color.WHITE);
                break;
            case 'Y':
                tile.setFill(Color.YELLOW);
                break;
            default:
                tile.setFill(Color.GRAY);
        }
    }

    // 获取每个面在GridPane中的列偏移量
    private int getColumnOffset(int face) {
        return (face % 3) * FACE_SIZE;
    }

    // 获取每个面在GridPane中的行偏移量
    private int getRowOffset(int face) {
        return (face / 3) * FACE_SIZE;
    }

    public static void main(String[] args) {
        launch(args);
    }
}*/
